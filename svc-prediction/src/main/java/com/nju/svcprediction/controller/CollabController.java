package com.nju.svcprediction.controller;

import com.nju.svcprediction.domain.CollabPredictRes;
import com.nju.svcprediction.domain.CollaborateRes;
import com.nju.svcprediction.domain.Document;
import com.nju.svcprediction.domain.ResponseVO;
import com.nju.svcprediction.service.CollabSvc;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/author")
public class CollabController {

    private final CollabSvc collabSvc;

    public CollabController(CollabSvc collabSvc) {
        this.collabSvc = collabSvc;
    }

    @RequestMapping("/coworkers/map")
    public ResponseVO getCollaborateMap(@RequestParam int id, @RequestParam String db){
        return collabSvc.getCollaborateMap(id, db);
    }

    @RequestMapping("/coworkers/recommend")
    public ResponseVO collaboratePrediction(@RequestParam int id, @RequestParam String db){
        return collabSvc.collaboratePrediction(id, db);
    }

    @RequestMapping(value = "/coworkers/predict", method = RequestMethod.POST)
    public ResponseVO collaboratePrediction(@RequestBody ArrayList<Document> documents){
        return collabSvc.getFutureCollab(documents);
    }
}
