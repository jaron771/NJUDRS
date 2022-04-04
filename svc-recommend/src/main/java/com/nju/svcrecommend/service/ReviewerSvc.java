package com.nju.svcrecommend.service;

import com.nju.svcrecommend.domain.ResponseVO;
import com.nju.svcrecommend.domain.ReviewerReq;

public interface ReviewerSvc {

    ResponseVO getRecommendReviewers(ReviewerReq reviewerReq);

    ResponseVO getShieldReviewers(ReviewerReq reviewerReq);
}
