package com.nju.svcdisambiguation.controller;


import com.nju.svcdisambiguation.service.PaperDetailService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/paper")
public class PaperDetailController {

    private final PaperDetailService paperDetailService;

    public PaperDetailController(PaperDetailService paperDetailService) {
        this.paperDetailService = paperDetailService;
    }

    @GetMapping("/info")
    public ResponseVO getPaperInfoByPaperId(@RequestParam("id") int paperId, @RequestParam String db){
        return paperDetailService.getPaperInfoByPaperId(paperId, db);
    }

    @GetMapping("/refer")
    public ResponseVO getPaperRefer(@RequestParam int id, @RequestParam String db, @RequestParam int page, @RequestParam int pageSize){
        return paperDetailService.getPaperRefer(id, db, page, pageSize);
    }
}
