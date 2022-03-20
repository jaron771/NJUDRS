package com.nju.svcrecommend.controller;

import com.nju.svcrecommend.domain.ResponseVO;
import com.nju.svcrecommend.domain.ReviewerReq;
import com.nju.svcrecommend.service.ReviewerSvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/reviewer")
public class ReviewerController {

    private final ReviewerSvc reviewerSvc;

    public ReviewerController(ReviewerSvc reviewerSvc) {
        this.reviewerSvc = reviewerSvc;
    }

    @RequestMapping("/recommend")
    public ResponseVO getRecommendReviewers(@RequestBody ReviewerReq reviewerReq){
        return reviewerSvc.getRecommendReviewers(reviewerReq);
    }

    @RequestMapping("/shield")
    public ResponseVO getShieldReviewers(@RequestBody ReviewerReq reviewerReq){
        return reviewerSvc.getShieldReviewers(reviewerReq);
    }
}
