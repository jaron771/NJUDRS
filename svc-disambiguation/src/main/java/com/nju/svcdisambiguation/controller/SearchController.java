package com.nju.svcdisambiguation.controller;

import com.nju.svcdisambiguation.service.SearchService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/author")
    public ResponseVO searchByAuthorName(@RequestParam("author") String authorName, @RequestParam int page, @RequestParam int pageSize, @RequestParam int sortBy, @RequestParam int startTime, @RequestParam int endTime){
        return searchService.searchByAuthorName(authorName, page, pageSize, sortBy, startTime, endTime);
    }

    @GetMapping("/institution")
    public ResponseVO searchByInstitutionName(@RequestParam String institution, @RequestParam int page, @RequestParam int pageSize, @RequestParam int sortBy, @RequestParam int startTime, @RequestParam int endTime){
        return searchService.searchByInstitutionName(institution, page, pageSize, sortBy, startTime, endTime);
    }
}
