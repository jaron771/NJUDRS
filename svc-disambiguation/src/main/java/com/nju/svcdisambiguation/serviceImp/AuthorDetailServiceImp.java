package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.dataMapper.acm.ACMAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEAuthorDetailMapper;
import com.nju.svcdisambiguation.po.AuthorInstitutionsPO;
import com.nju.svcdisambiguation.po.FieldSummaryPO;
import com.nju.svcdisambiguation.po.PaperActivationPO;
import com.nju.svcdisambiguation.service.AuthorDetailService;
import com.nju.svcdisambiguation.vo.PaperVO;
import com.nju.svcdisambiguation.vo.PapersVO;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.detail.ReferenceVO;
import com.nju.svcdisambiguation.vo.detail.author.*;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

@Service
public class AuthorDetailServiceImp implements AuthorDetailService {

    private final IEEEAuthorDetailMapper ieeeAuthorDetailMapper;
    private final ACMAuthorDetailMapper acmAuthorDetailMapper;

    public AuthorDetailServiceImp(IEEEAuthorDetailMapper ieeeAuthorDetailMapper, ACMAuthorDetailMapper acmAuthorDetailMapper) {
        this.ieeeAuthorDetailMapper = ieeeAuthorDetailMapper;
        this.acmAuthorDetailMapper = acmAuthorDetailMapper;
    }

    @Override
    public ResponseVO getAuthorDetail(int authorId, String db) {
        if (db.equals("ACM")) {
            AuthorDetailVO authorDetailVO = acmAuthorDetailMapper.selectAuthorDetailById(authorId);
            ArrayList<InstitutionAuthorDetailVO> institutionAuthorDetailVOS = acmAuthorDetailMapper.selectInstitutionByAuthorId(authorId);
            for (InstitutionAuthorDetailVO institutionAuthorDetailVO:institutionAuthorDetailVOS){
                institutionAuthorDetailVO.setDb("ACM");
            }
            authorDetailVO.setInstitution(institutionAuthorDetailVOS);
            ArrayList<PaperActivationPO> paperActivationPOS = acmAuthorDetailMapper.selectPaperActivationPOByAuthorId(authorId);
            authorDetailVO.setActivation(calculateActivation(paperActivationPOS));
            authorDetailVO.setTotalCitations(calculateTotalCitations(paperActivationPOS));
            authorDetailVO.setSameAuthors(acmAuthorDetailMapper.selectSameAuthorsByAuthorId(authorId));
            authorDetailVO.setDocCount(acmAuthorDetailMapper.selectDocCountByAuthorId(authorId));
            authorDetailVO.setFieldList(acmAuthorDetailMapper.selectKeywordsAuthorDetailByAuthorId(authorId));
            for(KeywordsAuthorDetailVO keywordsAuthorDetailVO:authorDetailVO.getFieldList()){
                keywordsAuthorDetailVO.setActivation(calculateActivation(acmAuthorDetailMapper.selectPAVOByFieldNameAndAuthorId(
                        keywordsAuthorDetailVO.getName(),
                        authorId
                )));
            }
            return ResponseVO.buildSuccess(authorDetailVO);
        }

        AuthorDetailVO authorDetailVO = ieeeAuthorDetailMapper.selectAuthorDetailById(authorId);
        ArrayList<InstitutionAuthorDetailVO> institutionAuthorDetailVOS = ieeeAuthorDetailMapper.selectInstitutionByAuthorId(authorId);
        for (InstitutionAuthorDetailVO institutionAuthorDetailVO:institutionAuthorDetailVOS){
            institutionAuthorDetailVO.setDb("IEEE");
        }
        authorDetailVO.setInstitution(institutionAuthorDetailVOS);
        ArrayList<PaperActivationPO> paperActivationPOS = ieeeAuthorDetailMapper.selectPaperActivationPOByAuthorId(authorId);
        authorDetailVO.setActivation(calculateActivation(paperActivationPOS));
        authorDetailVO.setTotalCitations(calculateTotalCitations(paperActivationPOS));
        authorDetailVO.setSameAuthors(ieeeAuthorDetailMapper.selectSameAuthorsByAuthorId(authorId));
        authorDetailVO.setDocCount(ieeeAuthorDetailMapper.selectDocCountByAuthorId(authorId));
        authorDetailVO.setFieldList(ieeeAuthorDetailMapper.selectKeywordsAuthorDetailByAuthorId(authorId));
        for(KeywordsAuthorDetailVO keywordsAuthorDetailVO:authorDetailVO.getFieldList()){
            keywordsAuthorDetailVO.setActivation(calculateActivation(acmAuthorDetailMapper.selectPAVOByFieldNameAndAuthorId(
                    keywordsAuthorDetailVO.getName(),
                    authorId
            )));
        }
        return ResponseVO.buildSuccess(authorDetailVO);
    }

    private int calculateTotalCitations(ArrayList<PaperActivationPO> paperActivationPOS) {
        int ret = 0;
        for (PaperActivationPO paperActivationPO:paperActivationPOS){
            ret += paperActivationPO.getCitations();
        }
        return ret;
    }

    private double calculateActivation(ArrayList<PaperActivationPO> paperActivationPOS) {
        double ret = 0.0;
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);

        for(PaperActivationPO paperActivationPO:paperActivationPOS){
            ret += (double)paperActivationPO.getCitations()/(year - paperActivationPO.getYear() + 1.0);
        }

        return ret;
    }

    @Override
    public ResponseVO getAuthorPublicationSummary(int authorId, String db) {
        if (db.equals("ACM")) {
            return ResponseVO.buildSuccess(acmAuthorDetailMapper.selectAuthorPublicationSummaryByAuthorId(authorId));
        }
        return ResponseVO.buildSuccess(ieeeAuthorDetailMapper.selectAuthorPublicationSummaryByAuthorId(authorId));
    }

    @Override
    public ResponseVO getAuthorFieldSummary(int authorId, String db) {
        ArrayList<FieldSummaryPO> fieldSummaryPOS = new ArrayList<>();
        ArrayList<AuthorFieldSummaryVO> authorFieldSummaryVOS = new ArrayList<>();
        if (db.equals("ACM")){
            fieldSummaryPOS = acmAuthorDetailMapper.selectFieldSummaryPOByAuthorId(authorId);
            for (FieldSummaryPO fieldSummaryPO:fieldSummaryPOS){
                AuthorFieldSummaryVO authorFieldSummaryVO = new AuthorFieldSummaryVO(
                        fieldSummaryPO.getFieldId(),
                        fieldSummaryPO.getFieldName(),
                        fieldSummaryPO.getCount(),
                        "ACM"
                );
                authorFieldSummaryVOS.add(authorFieldSummaryVO);
            }
            return ResponseVO.buildSuccess(authorFieldSummaryVOS);
        }
        fieldSummaryPOS = ieeeAuthorDetailMapper.selectFieldSummaryPOByAuthorId(authorId);
        for (FieldSummaryPO fieldSummaryPO:fieldSummaryPOS){
            AuthorFieldSummaryVO authorFieldSummaryVO = new AuthorFieldSummaryVO(
                    fieldSummaryPO.getFieldId(),
                    fieldSummaryPO.getFieldName(),
                    fieldSummaryPO.getCount(),
                    "IEEE"
            );
            authorFieldSummaryVOS.add(authorFieldSummaryVO);
        }
        return ResponseVO.buildSuccess(authorFieldSummaryVOS);
    }

    @Override
    public ResponseVO getAuthorRefer(int id, String db, int page, int pageSize) {
        ArrayList<ReferenceVO> referenceVOS = db.equals("ACM") ? acmAuthorDetailMapper.selectReferenceVOByAuthorId(id, (page-1)*pageSize, pageSize)
                : ieeeAuthorDetailMapper.selectReferenceVOByAuthorId(id, page, pageSize);
        for (ReferenceVO referenceVO:referenceVOS){
            int paperId = referenceVO.getId();
            referenceVO.setAuthors(db.equals("ACM") ? acmAuthorDetailMapper.selectAuthorsByPaperId(paperId) : ieeeAuthorDetailMapper.selectAuthorsByPaperId(paperId));
            referenceVO.setKeywords(db.equals("ACM") ? acmAuthorDetailMapper.selectKeywordsByPaperId(paperId) : ieeeAuthorDetailMapper.selectKeywordsByPaperId(paperId));
        }
        ResponseVO responseVO = new ResponseVO();
        responseVO.setMessage(
                Integer.toString(db.equals("ACM") ? acmAuthorDetailMapper.selectReferenceVONumByAuthorId(id) : ieeeAuthorDetailMapper.selectReferenceVONumByAuthorId(id))
        );
        responseVO.setSuccess(true);
        responseVO.setContent(referenceVOS);
        return responseVO;
    }

    @Override
    public ResponseVO getAuthorReferred(int id, String db) {
        return ResponseVO.buildSuccess(new AuthorReferredVO(
                db.equals("ACM") ? acmAuthorDetailMapper.selectAuthorReferred(id) : ieeeAuthorDetailMapper.selectAuthorReferred(id)
        ));
    }

    @Override
    public ResponseVO getAuthorInfluence(int id, String db) {
        int docCounts = db.equals("ACM") ? acmAuthorDetailMapper.selectDocCnt(id) : ieeeAuthorDetailMapper.selectDocCnt(id);
        int refferred = db.equals("ACM") ? acmAuthorDetailMapper.selectAuthorReferred(id) : ieeeAuthorDetailMapper.selectAuthorReferred(id);
        if (docCounts == 0) return ResponseVO.buildSuccess(new AuthorInfluenceVO(0));
        return ResponseVO.buildSuccess(new AuthorInfluenceVO(
                (double)refferred/docCounts
        ));
    }

    @Override
    public ResponseVO getAuthorInstitutions(int id, String db) {
        ArrayList<AuthorInstitutionsPO> authorInstitutionsPOS =
                db.equals("ACM") ? acmAuthorDetailMapper.selectAuthorInstitutions(id) :
                        ieeeAuthorDetailMapper.selectAuthorInstitutions(id);
        return ResponseVO.buildSuccess(authorInstitutionsPOS);
    }

    @Override
    public ResponseVO getAuthorPapers(int id, String db, int page, int pageSize) {
        ArrayList<PaperVO> paperVOS = db.equals("ACM") ? acmAuthorDetailMapper.selectPaperVOByAuthorId(id) :
                ieeeAuthorDetailMapper.selectPaperVOByAuthorId(id);

        PaperVO[] paperVOSArray = (PaperVO[])paperVOS.toArray(new PaperVO[paperVOS.size()]);

        ArrayList<PaperVO> documents = new ArrayList<>();
        //0 1 2 3 4 5 6 7 8
        for (int i = (page-1)*pageSize; i < Math.min(page*pageSize, paperVOS.size()); ++i){
            PaperVO paperVO = paperVOSArray[i];
            if (paperVO.getPublication() == null) {
                paperVO.setPublication("");
            }
            paperVO.setAuthors(paperVO.getDb().equals("ACM") ? acmAuthorDetailMapper.selectAuthorsByDocId(paperVO.getDocId())
                    : ieeeAuthorDetailMapper.selectAuthorsByDocId(paperVO.getDocId()));
            documents.add(paperVO);
        }
        PapersVO papersVO = new PapersVO(documents, paperVOS.size());
        return ResponseVO.buildSuccess(papersVO);
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