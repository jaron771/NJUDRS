package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.dataMapper.acm.ACMSearchMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEESearchMapper;
import com.nju.svcdisambiguation.po.acm.ACMPaperPO;
import com.nju.svcdisambiguation.po.ieee.IEEEPaperPO;
import com.nju.svcdisambiguation.service.SearchService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.search.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.min;


public class SearchServiceImpOld implements SearchService {

    private final IEEESearchMapper ieeeSearchMapper;
    private final ACMSearchMapper acmSearchMapper;

    public SearchServiceImpOld(IEEESearchMapper ieeeSearchMapper, ACMSearchMapper acmSearchMapper) {
        this.ieeeSearchMapper = ieeeSearchMapper;
        this.acmSearchMapper = acmSearchMapper;
    }

    @Override
    public ResponseVO searchByAuthorName(String authorName, int page, int pageSize, int sortBy, int startTime, int endTime) {

        // ieeeSearchMapper
        ArrayList<DocumentSearchResultVO> documentSearchResultVOS = searchIEEEByAuthorName(authorName, startTime, endTime);
        // acmSearchMapper
        documentSearchResultVOS.addAll(searchACMByAuthorName(authorName, startTime, endTime));
        return formatSearchResult(documentSearchResultVOS, sortBy, page, pageSize);
    }

    @Override
    public ResponseVO searchByInstitutionName(String institutionName, int page, int pageSize, int sortBy, int startTime, int endTime) {
        ArrayList<DocumentSearchResultVO> documentSearchResultVOS = searchACMByInstitution(institutionName, startTime, endTime);
        documentSearchResultVOS.addAll(searchIEEEByInstitution(institutionName, startTime, endTime));
        return formatSearchResult(documentSearchResultVOS, sortBy, page, pageSize);
    }

    private ArrayList<DocumentSearchResultVO> searchIEEEByInstitution(String institution, int startTime, int endTime) {
        ArrayList<IEEEPaperPO> ieeePaperPOS = ieeeSearchMapper.selectIEEEPaperPOByInstitutionName("%"+institution+"%", startTime, endTime);
        return getDocumentSearchResultVOSByIEEEPaperPOS(ieeePaperPOS);
    }

    private ArrayList<DocumentSearchResultVO> searchACMByInstitution(String institution, int startTime, int endTime) {
        ArrayList<ACMPaperPO> acmPaperPOS = acmSearchMapper.selectACMPaperPOByInstitutionName("%"+institution+"%", startTime, endTime);
        return getDocumentSearchResultVOSByACMPaperPOS(acmPaperPOS);
    }

    private ArrayList<DocumentSearchResultVO> searchIEEEByAuthorName(String authorName, int startTime, int endTime){
        ArrayList<IEEEPaperPO> ieeePaperPOS = ieeeSearchMapper.selectIEEEPaperPOByAuthorName("%"+authorName+"%", startTime, endTime);
        return getDocumentSearchResultVOSByIEEEPaperPOS(ieeePaperPOS);
    }

    private ArrayList<DocumentSearchResultVO> searchACMByAuthorName(String authorName, int startTime, int endTime){
        ArrayList<ACMPaperPO> acmPaperPOS = acmSearchMapper.selectACMPaperPOByAuthorName("%"+authorName+"%", startTime, endTime);
        return getDocumentSearchResultVOSByACMPaperPOS(acmPaperPOS);
    }

    private ArrayList<DocumentSearchResultVO> getDocumentSearchResultVOSByACMPaperPOS(ArrayList<ACMPaperPO> acmPaperPOS){
        ArrayList<DocumentSearchResultVO> documentSearchResultVOS = new ArrayList<>();
        for(ACMPaperPO acmPaperPO: acmPaperPOS){
            DocumentSearchResultVO documentSearchResultVO = new DocumentSearchResultVO();
            documentSearchResultVO.setDocId(acmPaperPO.getDocument_id());
            documentSearchResultVO.setTitle(acmPaperPO.getTitle());
            documentSearchResultVO.setAbs(acmPaperPO.getAbs());
            documentSearchResultVO.setPublication(acmPaperPO.getPublication());
            documentSearchResultVO.setYear(acmPaperPO.getYear());
            documentSearchResultVO.setKeywords(acmSearchMapper.selectKeywordsByDocId(acmPaperPO.getDocument_id()));
            documentSearchResultVO.setDb("ACM");
            documentSearchResultVO.setAuthors(acmSearchMapper.selectACMAuthorPOByDocId(acmPaperPO.getDocument_id()));
            documentSearchResultVO.setCitations(acmSearchMapper.selectCitationsCountByDocId(acmPaperPO.getDocument_id()));
            documentSearchResultVOS.add(documentSearchResultVO);
        }
        return documentSearchResultVOS;
    }

    private ArrayList<DocumentSearchResultVO> getDocumentSearchResultVOSByIEEEPaperPOS(ArrayList<IEEEPaperPO> ieeePaperPOS) {
        ArrayList<DocumentSearchResultVO> documentSearchResultVOS = new ArrayList<>();
        for(IEEEPaperPO ieeePaperPO: ieeePaperPOS){
            DocumentSearchResultVO documentSearchResultVO = new DocumentSearchResultVO(
                    ieeePaperPO.getDocument_id(),
                    "IEEE",
                    ieeePaperPO.getTitle(),
                    ieeePaperPO.getAbs(),
                    ieeeSearchMapper.selectIEEEAuthorPOByDocId(ieeePaperPO.getDocument_id()),
                    ieeePaperPO.getCitation_count(),
                    ieeePaperPO.getPublish_year(),
                    ieeePaperPO.getKeywords(),
                    ieeePaperPO.getPublication()
            );

            documentSearchResultVOS.add(documentSearchResultVO);
        }

        return documentSearchResultVOS;
    }

    private ResponseVO formatSearchResult(ArrayList<DocumentSearchResultVO> documentSearchResultVOS, int sortBy, int page, int pageSize){
        int total = documentSearchResultVOS.size();
        if(sortBy == 0){
            ArrayList<DSRRankedByTimeVO> dsrRankedByTimeVOS = new ArrayList<>();
            for(DocumentSearchResultVO documentSearchResultVO:documentSearchResultVOS){
                dsrRankedByTimeVOS.add(new DSRRankedByTimeVO(documentSearchResultVO));
            }
            Collections.sort(dsrRankedByTimeVOS);

            ArrayList<DSRRankedByTimeVO> res = new ArrayList<>();
            for(int i = pageSize*(page-1); i < min(pageSize*page, dsrRankedByTimeVOS.size()); ++i){
                res.add(dsrRankedByTimeVOS.get(i));
            }
            SearchResultTimeVO searchResultTimeVO = new SearchResultTimeVO(res, total);
            return ResponseVO.buildSuccess(searchResultTimeVO);
        }

        ArrayList<DSRRankedByCitationsVO> dsrRankedByCitationsVOS = new ArrayList<>();
        for(DocumentSearchResultVO documentSearchResultVO:documentSearchResultVOS){
            dsrRankedByCitationsVOS.add(new DSRRankedByCitationsVO(documentSearchResultVO));
        }
        Collections.sort(dsrRankedByCitationsVOS);
        ArrayList<DSRRankedByCitationsVO> res = new ArrayList<>();
        for(int i = pageSize*(page-1); i < pageSize*page; ++i){
            res.add(dsrRankedByCitationsVOS.get(i));
        }
        SearchResultCitationVO searchResultCitationVO = new SearchResultCitationVO(res, total);
        return ResponseVO.buildSuccess(searchResultCitationVO);
    }
}
