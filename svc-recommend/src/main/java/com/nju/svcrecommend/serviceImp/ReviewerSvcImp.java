package com.nju.svcrecommend.serviceImp;

import com.nju.svcrecommend.dataMapper.acm.ACMReviewerMapper;
import com.nju.svcrecommend.dataMapper.ieee.IEEEReviewerMapper;
import com.nju.svcrecommend.domain.ResponseVO;
import com.nju.svcrecommend.domain.ReviewerReq;
import com.nju.svcrecommend.domain.ReviewerRes;
import com.nju.svcrecommend.service.ReviewerSvc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ReviewerSvcImp implements ReviewerSvc {

    private final ACMReviewerMapper acmReviewerMapper;
    private final IEEEReviewerMapper ieeeReviewerMapper;

    public ReviewerSvcImp(ACMReviewerMapper acmReviewerMapper, IEEEReviewerMapper ieeeReviewerMapper) {
        this.acmReviewerMapper = acmReviewerMapper;
        this.ieeeReviewerMapper = ieeeReviewerMapper;
    }

    @Override
    public ResponseVO getRecommendReviewers(ReviewerReq reviewerReq) {
        boolean isACM = false;
        boolean isIEEE = false;
        if (acmReviewerMapper.getPublication(reviewerReq.getPublication()) != null) {
            isACM = true;
        }
        if (ieeeReviewerMapper.getPublication(reviewerReq.getPublication()) != null) {
            isIEEE = true;
        }
        if (!(isACM || isIEEE)) {
            return ResponseVO.buildFailure("Publication not exist.");
        }
        String[] keywords = reviewerReq.getKeywords().split(";");
        ArrayList<Integer> authorIds = new ArrayList<>();
        for (String kwd:keywords){
            authorIds.addAll(isACM ? acmReviewerMapper.getRecommendReviewersId(reviewerReq.getPublication(), kwd)
                    : ieeeReviewerMapper.getRecommendReviewersId(reviewerReq.getPublication(), kwd));
        }
        ArrayList<ReviewerRes> res = getReviewerRes(authorIds, isACM);
        return ResponseVO.buildSuccess(res);
    }

    @Override
    public ResponseVO getShieldReviewers(ReviewerReq reviewerReq) {
        boolean isACM = false;
        boolean isIEEE = false;
        if (acmReviewerMapper.getPublication(reviewerReq.getPublication()) != null) {
            isACM = true;
        }
        if (ieeeReviewerMapper.getPublication(reviewerReq.getPublication()) != null) {
            isIEEE = true;
        }
        if (!(isACM || isIEEE)) {
            return ResponseVO.buildFailure("Publication not exist.");
        }
        String[] authors = reviewerReq.getAuthors().split(";");
        ArrayList<Integer> authorIds = new ArrayList<>();
        for (String s:authors){
            authorIds.addAll(isACM ? acmReviewerMapper.getSameInsAuthorIDs(s) : ieeeReviewerMapper.getSameInsAuthorIDs(s));
        }
        ArrayList<ReviewerRes> res = getReviewerRes(authorIds, isACM);
        return ResponseVO.buildSuccess(res);
    }

    private ArrayList<ReviewerRes> getReviewerRes(ArrayList<Integer> authorIds, boolean isACM){
        HashMap<Integer, Integer> cnt = new HashMap<>();
        ArrayList<ReviewerRes> res = new ArrayList<>();
        int con = 0;
        for (int i = 0; i < authorIds.size() && con <=5 ; ++i){
            if (!cnt.containsKey(authorIds.get(i))){
                cnt.put(authorIds.get(i), 1);
                con++;
                res.add(new ReviewerRes(
                        isACM ? acmReviewerMapper.getReviewerName(authorIds.get(i)) : ieeeReviewerMapper.getReviewerName(authorIds.get(i)),
                        authorIds.get(i),
                        isACM ? "ACM" : "IEEE",
                        isACM ? acmReviewerMapper.getReviewerIns(authorIds.get(i)) : ieeeReviewerMapper.getReviewerIns(authorIds.get(i)),
                        isACM ? acmReviewerMapper.getReviewerKeywords(authorIds.get(i)) : ieeeReviewerMapper.getReviewerKeywords(authorIds.get(i))
                ));
            }
        }
        return res;
    }
}
