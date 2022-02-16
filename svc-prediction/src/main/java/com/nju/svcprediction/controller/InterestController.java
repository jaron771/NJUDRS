package com.nju.svcprediction.controller;

import com.nju.svcprediction.domain.*;
import com.nju.svcprediction.service.InterestSvc;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/author")
public class InterestController {

    private final InterestSvc interestSvc;

    public InterestController(InterestSvc interestSvc) {
        this.interestSvc = interestSvc;
    }

    @RequestMapping("/interest/history")
    public ResponseVO interestHistory(@RequestParam int id, @RequestParam String db){
        return interestSvc.getHistoryKeywords(id, db);
    }

    @RequestMapping("/interest/predict")
    public ResponseVO interestPrediction(@RequestParam int id, @RequestParam String db){
        return interestSvc.getFutureKeywords(id, db);
    }

    @RequestMapping(value = "/predict", method = RequestMethod.POST)
    public InterestRes interestPredictionAPI(@RequestBody ArrayList<Document> documents){
        return interestSvc.getFutureKeywords(documents);
    }

}
