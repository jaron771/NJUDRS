package com.nju.svcdisambiguation.vo.detail;

import java.util.ArrayList;

public class ReferenceVO {
    private int id;
    private String db;
    private String title;
    private String publication;
    private int year;
    private ArrayList<String> authors;
    private ArrayList<String> keywords;

    public ReferenceVO() {
    }

    public ReferenceVO(int id, String db, String title, String publication, int year, ArrayList<String> authors, ArrayList<String> keywords) {
        this.id = id;
        this.db = db;
        this.title = title;
        this.publication = publication;
        this.year = year;
        this.authors = authors;
        this.keywords = keywords;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
}
