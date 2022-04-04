package com.nju.svcrecommend.service;

import com.nju.svcrecommend.domain.ResponseVO;

public interface SLRSvc {
    ResponseVO getSLRRecommend(String keyword, int page, int pageSize, int sortBy, int startTime, int endTime);
}
