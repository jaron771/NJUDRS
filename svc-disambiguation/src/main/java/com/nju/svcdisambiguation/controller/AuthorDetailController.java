package com.nju.svcdisambiguation.controller;

import com.nju.svcdisambiguation.service.AuthorDetailService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/author")
public class AuthorDetailController {

    private final AuthorDetailService authorDetailService;

    public AuthorDetailController(AuthorDetailService authorDetailService) {
        this.authorDetailService = authorDetailService;
    }

    @GetMapping("/detail")
    public ResponseVO getAuthorDetail(@RequestParam("id") int authorId, @RequestParam String db){
        //db = "ACM" or "IEEE"
        return authorDetailService.getAuthorDetail(authorId, db);
    }

    @GetMapping("/publication/summary")
    public ResponseVO getAuthorPublicationSummary(@RequestParam("id") int authorId, @RequestParam String db){
        //db = "ACM" or "IEEE"
        return authorDetailService.getAuthorPublicationSummary(authorId, db);
    }

    @GetMapping("/field/summary")
    public ResponseVO getAuthorFieldSummary(@RequestParam("id") int authorId, @RequestParam String db){
        //db = "ACM" or "IEEE"
        return authorDetailService.getAuthorFieldSummary(authorId, db);
    }

    @GetMapping("/refer")
    public ResponseVO getAuthorRefer(@RequestParam int id, @RequestParam String db, @RequestParam int page, @RequestParam int pageSize){
        return authorDetailService.getAuthorRefer(id, db, page, pageSize);
    }

    @GetMapping("/referred")
    public ResponseVO getAuthorReferred(@RequestParam int id, @RequestParam String db){
        return authorDetailService.getAuthorReferred(id, db);
    }

    @GetMapping("/influence")
    public ResponseVO getAuthorInfluence(@RequestParam int id, @RequestParam String db){
        return authorDetailService.getAuthorInfluence(id, db);
    }

    @GetMapping("/institution")
    public ResponseVO getAuthorInstitutions(@RequestParam int id, @RequestParam String db){
        return authorDetailService.getAuthorInstitutions(id, db);
    }

    @GetMapping("/papers")
    public ResponseVO getAuthorPapers(@RequestParam int id, @RequestParam String db, @RequestParam int page, @RequestParam int pageSize){
        return authorDetailService.getAuthorPapers(id, db, page, pageSize);
    }

}
