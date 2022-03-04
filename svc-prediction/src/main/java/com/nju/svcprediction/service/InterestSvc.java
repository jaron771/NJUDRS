package com.nju.svcprediction.service;


import com.nju.svcprediction.domain.Document;
import com.nju.svcprediction.domain.InterestRes;
import com.nju.svcprediction.domain.ResponseVO;

import java.util.ArrayList;

public interface InterestSvc {

    ResponseVO getHistoryKeywords(int id, String db);

    ResponseVO getFutureKeywords(int id, String db);

    InterestRes getFutureKeywords(ArrayList<Document> documents);

}
