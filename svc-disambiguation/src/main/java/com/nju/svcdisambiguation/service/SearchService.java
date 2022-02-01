package com.nju.svcdisambiguation.service;

import com.nju.svcdisambiguation.vo.ResponseVO;

public interface SearchService {

    ResponseVO searchByAuthorName(String authorName, int page, int pageSize, int sortBy, int startTime, int endTime);

    ResponseVO searchByInstitutionName(String institutionName, int page, int pageSize, int sortBy, int startTime, int endTime);

}
