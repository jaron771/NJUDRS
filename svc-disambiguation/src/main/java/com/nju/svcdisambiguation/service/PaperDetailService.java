package com.nju.svcdisambiguation.service;

import com.nju.svcdisambiguation.vo.ResponseVO;

public interface PaperDetailService {

    ResponseVO getPaperInfoByPaperId(int paperId, String db);

    ResponseVO getPaperRefer(int id, String db, int page, int pageSize);
}
