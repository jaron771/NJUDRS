package com.nju.svcprediction.service;

import com.nju.svcprediction.domain.CollabPredictRes;
import com.nju.svcprediction.domain.CollaborateRes;
import com.nju.svcprediction.domain.Document;
import com.nju.svcprediction.domain.ResponseVO;

import java.util.ArrayList;

public interface CollabSvc {

    ResponseVO getCollaborateMap(int id, String db);

    ResponseVO collaboratePrediction(int id, String db);

    ResponseVO getFutureCollab(ArrayList<Document> documents);
}
