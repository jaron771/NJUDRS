package com.nju.svcdisambiguation.controller;

import com.nju.svcdisambiguation.service.DisambiguationService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/disambiguation")
public class DisambiguationController {

    private final DisambiguationService disambiguationService;

    public DisambiguationController(DisambiguationService disambiguationService) {
        this.disambiguationService = disambiguationService;
    }

    @GetMapping("/Author")
    public void startAuthorDisambiguation(@RequestParam String db, @RequestParam char alpha, @RequestParam int length){
        disambiguationService.startAuthorDisambiguation(db, alpha, length);
    }

    @GetMapping("/Ins")
    public void startInsDisambiguation(@RequestParam String db, @RequestParam char alpha, @RequestParam int length){
        disambiguationService.startInsDisambiguation(db, alpha, length);
    }

    @GetMapping("/author")
    public double getAuthorSimilarity(@RequestParam String db, @RequestParam int id1, @RequestParam int id2){
        return disambiguationService.getAuthorSimilarity(db, id1, id2);
    }

    @GetMapping("/ins")
    public double getInsSimilarity(@RequestParam String db, @RequestParam int id1, @RequestParam int id2){
        return disambiguationService.getAuthorSimilarity(db, id1, id2);
    }

    @GetMapping("length")
    public void calLength(@RequestParam String table, @RequestParam String db){
        disambiguationService.calLength(table, db);
    }
}
