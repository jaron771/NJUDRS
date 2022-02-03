package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.dataMapper.acm.ACMSearchMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEESearchMapper;
import com.nju.svcdisambiguation.po.acm.ACMAuthorPO;
import com.nju.svcdisambiguation.po.acm.ACMPaperPO;
import com.nju.svcdisambiguation.po.ieee.IEEEAuthorPO;
import com.nju.svcdisambiguation.po.ieee.IEEEPaperPO;
import com.nju.svcdisambiguation.service.SearchService;
import com.nju.svcdisambiguation.vo.PaperVO;
import com.nju.svcdisambiguation.vo.PapersVO;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.search.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.lang.Math.min;

@Service
public class SearchServiceImp implements SearchService {

    private final IEEESearchMapper ieeeSearchMapper;
    private final ACMSearchMapper acmSearchMapper;

    public SearchServiceImp(IEEESearchMapper ieeeSearchMapper, ACMSearchMapper acmSearchMapper) {
        this.ieeeSearchMapper = ieeeSearchMapper;
        this.acmSearchMapper = acmSearchMapper;
    }

    private ResponseVO search(String param, int page, int pageSize, int sortBy,
                              int startTime, int endTime, TriFunction tf1, TriFunction tf2){
        ArrayList<PaperVO> paperVOS = tf1.getPaperVO(param, startTime, endTime);
        paperVOS.addAll(tf2.getPaperVO(param, startTime, endTime));
        PaperVO[] paperVOSArray = (PaperVO[])paperVOS.toArray(new PaperVO[paperVOS.size()]);
        paperVOSArray = sort(sortBy, paperVOSArray);
        ArrayList<PaperVO> documents = page(page, pageSize, paperVOSArray);
        PapersVO papersVO = new PapersVO(documents, paperVOS.size());
        return ResponseVO.buildSuccess(papersVO);
    }

    @Override
    public ResponseVO searchByAuthorName(String authorName, int page, int pageSize, int sortBy, int startTime, int endTime) {
        return search("%"+authorName+"%", page, pageSize, sortBy, startTime, endTime,
                acmSearchMapper::selectPaperVOByAuthorName, ieeeSearchMapper::selectPaperVOByAuthorName);
    }

    @Override
    public ResponseVO searchByInstitutionName(String institutionName, int page, int pageSize, int sortBy, int startTime, int endTime) {
        return search("%"+institutionName+"%", page, pageSize, sortBy, startTime, endTime,
                acmSearchMapper::selectPaperVOByInsName, ieeeSearchMapper::selectPaperVOByInsName);
    }

    private PaperVO[] sort(int sortBy, PaperVO[] paperVOS){
        if (sortBy == 0) {
            Arrays.sort(paperVOS, new YearCmp());
        }
        else {
            Arrays.sort(paperVOS, new CitationsCmp());
        }
        return paperVOS;
    }

    private ArrayList<PaperVO> page(int page, int pageSize, PaperVO[] paperVOS){
        ArrayList<PaperVO> documents = new ArrayList<>();
        //0 1 2 3 4 5 6 7 8
        for (int i = (page-1)*pageSize; i < Math.min(page*pageSize, paperVOS.length); ++i){
            PaperVO paperVO = paperVOS[i];
            if (paperVO.getPublication() == null) {
                paperVO.setPublication("");
            }
            paperVO.setAuthors(paperVO.getDb().equals("ACM") ? acmSearchMapper.selectAuthorsByDocId(paperVO.getDocId())
                    : ieeeSearchMapper.selectAuthorsByDocId(paperVO.getDocId()));
            documents.add(paperVO);
        }
        return documents;
    }

}
