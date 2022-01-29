package com.nju.svcdisambiguation.controller;

import com.nju.svcdisambiguation.service.TestService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/emp")
    public ResponseVO getEmpName() {
        return testService.getEmpName();
    }
}
