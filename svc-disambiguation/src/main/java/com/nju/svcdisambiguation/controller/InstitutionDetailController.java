package com.nju.svcdisambiguation.controller;

import com.nju.svcdisambiguation.service.AuthorDetailService;
import com.nju.svcdisambiguation.service.InstitutionDetailService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/institution")
public class InstitutionDetailController {

    private final InstitutionDetailService institutionDetailService;

    public InstitutionDetailController(InstitutionDetailService institutionDetailService) {
        this.institutionDetailService = institutionDetailService;
    }

    @GetMapping("/info")
    public ResponseVO getInstitutionInfo(@RequestParam("id") int instituteId, @RequestParam String db){
        //db = "ACM" or "IEEE"
        return institutionDetailService.getInstitutionInfo(instituteId, db);
    }

    @GetMapping("/field/stat")
    public ResponseVO getInstitutionFieldStat(@RequestParam("id") int instituteId, @RequestParam String db){
        //db = "ACM" or "IEEE"
        return institutionDetailService.getInstitutionFieldStat(instituteId, db);
    }

    @GetMapping("/author/stat")
    public ResponseVO getInstitutionAuthorStat(@RequestParam("id") int instituteId, @RequestParam String db){
        //db = "ACM" or "IEEE"
        return institutionDetailService.getInstitutionAuthorStat(instituteId, db);
    }

    @GetMapping("/author/activation")
    public ResponseVO getInstitutionAuthorActivation(@RequestParam("id") int instituteId, @RequestParam String db){
        //db = "ACM" or "IEEE"
        return institutionDetailService.getInstitutionAuthorActivation(instituteId, db);
    }

    @GetMapping("/sameAuthor")
    public ResponseVO getInstitutionSameAuthors(@RequestParam int id, @RequestParam String db){
        return institutionDetailService.getInstitutionSameAuthors(id, db);
    }
}
