package com.nju.svcrecommend.controller;

import com.nju.svcrecommend.domain.ResponseVO;
import com.nju.svcrecommend.service.SLRSvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/slr")
public class SLRController {

    private final SLRSvc slrSvc;

    public SLRController(SLRSvc slrSvc) {
        this.slrSvc = slrSvc;
    }

    @RequestMapping("/recommend")
    public ResponseVO getSLRRecommend(@RequestParam String keyword, @RequestParam int page, @RequestParam int pageSize, @RequestParam int sortBy, @RequestParam int startTime, @RequestParam int endTime){
        return slrSvc.getSLRRecommend(keyword, page, pageSize, sortBy, startTime, endTime);
    }

}
