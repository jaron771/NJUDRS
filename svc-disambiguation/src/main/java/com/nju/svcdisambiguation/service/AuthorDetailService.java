package com.nju.svcdisambiguation.service;

import com.nju.svcdisambiguation.vo.ResponseVO;

public interface AuthorDetailService {

    ResponseVO getAuthorDetail(int authorId, String db);

    ResponseVO getAuthorPublicationSummary(int authorId, String db);

    ResponseVO getAuthorFieldSummary(int authorId, String db);

    ResponseVO getAuthorRefer(int id, String db, int page, int pageSize);

    ResponseVO getAuthorReferred(int id, String db);

    ResponseVO getAuthorInfluence(int id, String db);

    ResponseVO getAuthorInstitutions(int id, String db);

    ResponseVO getAuthorPapers(int id, String db, int page, int pageSize);
}
