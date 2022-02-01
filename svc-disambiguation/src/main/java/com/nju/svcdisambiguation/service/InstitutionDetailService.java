package com.nju.svcdisambiguation.service;

import com.nju.svcdisambiguation.vo.ResponseVO;

public interface InstitutionDetailService {
    
    ResponseVO getInstitutionInfo(int instituteId, String db);

    ResponseVO getInstitutionFieldStat(int instituteId, String db);
    
    ResponseVO getInstitutionAuthorStat(int instituteId, String db);

    ResponseVO getInstitutionAuthorActivation(int instituteId, String db);

    ResponseVO getInstitutionSameAuthors(int id, String db);
}
