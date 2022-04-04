package com.nju.svcrecommend.serviceImp;

import com.nju.svcrecommend.dataMapper.acm.ACMSLRMapper;
import com.nju.svcrecommend.dataMapper.ieee.IEEESLRMapper;
import com.nju.svcrecommend.domain.PaperVO;
import com.nju.svcrecommend.domain.ResponseVO;
import com.nju.svcrecommend.domain.SLRVO;
import com.nju.svcrecommend.service.SLRSvc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

@Service
public class SLRSvcImp implements SLRSvc {

    private final ACMSLRMapper acmslrMapper;
    private final IEEESLRMapper ieeeslrMapper;

    public SLRSvcImp(ACMSLRMapper acmslrMapper, IEEESLRMapper ieeeslrMapper) {
        this.acmslrMapper = acmslrMapper;
        this.ieeeslrMapper = ieeeslrMapper;
    }

    @Override
    public ResponseVO getSLRRecommend(String keywords, int page, int pageSize, int sortBy, int startTime, int endTime) {
        String[] k = keywords.split(";");
        ArrayList<PaperVO> paperVOS = new ArrayList<>();
        for(String keyword: k){
            paperVOS.addAll(acmslrMapper.selectPaperVOsByKeyword("%"+keyword+"%", startTime, endTime));
            paperVOS.addAll(ieeeslrMapper.selectPaperVOsByKeyword("%"+keyword+"%", startTime, endTime));
        }
        if(paperVOS.size() == 0) {return ResponseVO.buildSuccess(new SLRVO(paperVOS, 0));}
        PaperVO[] paperVOSArray = (PaperVO[])paperVOS.toArray(new PaperVO[paperVOS.size()]);

        if (sortBy == 0) {
            Arrays.sort(paperVOSArray, new YearCmp());
        }
        else {
            Arrays.sort(paperVOSArray, new CitationsCmp());
        }

        ArrayList<PaperVO> documents = new ArrayList<>();
        //0 1 2 3 4 5 6 7 8
        for (int i = (page-1)*pageSize; i < Math.min(page*pageSize, paperVOS.size()); ++i){
            PaperVO paperVO = paperVOSArray[i];
            if (paperVO.getPublication() == null) {
                paperVO.setPublication("");
            }
            paperVO.setAuthors(paperVO.getDb().equals("ACM") ? acmslrMapper.selectAuthorsByDocId(paperVO.getDocId())
                    : ieeeslrMapper.selectAuthorsByDocId(paperVO.getDocId()));
            if (paperVO.getDb().equals("ACM")){
                paperVO.setKeywords(acmslrMapper.selectKeywordsByDocId(paperVO.getDocId()));
            }
            documents.add(paperVO);
        }
        SLRVO slrvo = new SLRVO(documents, paperVOS.size());
        return ResponseVO.buildSuccess(slrvo);
    }
}

class CitationsCmp implements Comparator {
    public int compare(Object arg0, Object arg1) {
        PaperVO paperVO1 = (PaperVO)arg0;
        PaperVO paperVO2 = (PaperVO)arg1;
        if (paperVO1.getCitations() == paperVO2.getCitations()) {
            return 0;
        }
        return paperVO1.getCitations() > paperVO2.getCitations() ? -1:1;
    }
}

class YearCmp implements Comparator {
    public int compare(Object arg0, Object arg1) {
        PaperVO paperVO1 = (PaperVO)arg0;
        PaperVO paperVO2 = (PaperVO)arg1;
        if (paperVO1.getYear() == paperVO2.getYear()) {
            return 0;
        }
        return paperVO1.getYear() > paperVO2.getYear() ? -1:1;
    }
}
