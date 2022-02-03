package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.dataMapper.acm.ACMSearchMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEESearchMapper;
import com.nju.svcdisambiguation.service.SearchService;
import com.nju.svcdisambiguation.vo.PaperVO;
import com.nju.svcdisambiguation.vo.PapersVO;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;


public class SearchServiceImpOld2 implements SearchService {

    private final IEEESearchMapper ieeeSearchMapper;
    private final ACMSearchMapper acmSearchMapper;

    public SearchServiceImpOld2(IEEESearchMapper ieeeSearchMapper, ACMSearchMapper acmSearchMapper) {
        this.ieeeSearchMapper = ieeeSearchMapper;
        this.acmSearchMapper = acmSearchMapper;
    }

    @Override
    public ResponseVO searchByAuthorName(String authorName, int page, int pageSize, int sortBy, int startTime, int endTime) {
        ArrayList<PaperVO> paperVOS = acmSearchMapper.selectPaperVOByAuthorName(authorName, startTime, endTime);
        paperVOS.addAll(ieeeSearchMapper.selectPaperVOByInsName(authorName, startTime, endTime));
        PaperVO[] paperVOSArray = (PaperVO[])paperVOS.toArray(new PaperVO[paperVOS.size()]);
        paperVOSArray = sort(sortBy, paperVOSArray);
        ArrayList<PaperVO> documents = page(page, pageSize, paperVOSArray);
        PapersVO papersVO = new PapersVO(documents, paperVOS.size());
        return ResponseVO.buildSuccess(papersVO);
    }

    @Override
    public ResponseVO searchByInstitutionName(String institutionName, int page, int pageSize, int sortBy, int startTime, int endTime) {
        ArrayList<PaperVO> paperVOS = acmSearchMapper.selectPaperVOByInsName(institutionName, startTime, endTime);
        paperVOS.addAll(ieeeSearchMapper.selectPaperVOByInsName(institutionName, startTime, endTime));
        PaperVO[] paperVOSArray = (PaperVO[])paperVOS.toArray(new PaperVO[paperVOS.size()]);
        paperVOSArray = sort(sortBy, paperVOSArray);
        ArrayList<PaperVO> documents = page(page, pageSize, paperVOSArray);
        PapersVO papersVO = new PapersVO(documents, paperVOS.size());
        return ResponseVO.buildSuccess(papersVO);
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
