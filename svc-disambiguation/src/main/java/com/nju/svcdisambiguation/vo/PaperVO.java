package com.nju.svcdisambiguation.vo;

import java.util.ArrayList;

public class PaperVO {
    private int docId;
    private String db;
    private String title;
    private String abs;
    private String publication;
    private int year;
    private int citations;
    private ArrayList<AuthorVO> authors;
    private String keywords;

    public PaperVO() {
    }

    public PaperVO(int docId, String db, String title, String abs, String publication, int year, int citations, ArrayList<AuthorVO> authors, String keywords) {
        this.docId = docId;
        this.db = db;
        this.title = title;
        this.abs = abs;
        this.publication = publication;
        this.year = year;
        this.citations = citations;
        this.authors = authors;
        this.keywords = keywords;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
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

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
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

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

    public ArrayList<AuthorVO> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<AuthorVO> authors) {
        this.authors = authors;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
