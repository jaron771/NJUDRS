package com.nju.svcdisambiguation.vo.search;

import java.util.ArrayList;
import java.util.Comparator;

public class DocumentSearchResultVO implements Comparable {
    private int docId;
    private String db;
    private String title;
    private String abs;
    private ArrayList<AuthorSearchResultVO> authors;
    private int citations;
    private int year;
    private String keywords;
    private String publication;

    public DocumentSearchResultVO() {
        authors = new ArrayList<>();
    }

    public DocumentSearchResultVO(int docId, String db, String title, String abs, ArrayList<AuthorSearchResultVO> authors, int citations, int year, String keywords, String publication) {
        this.docId = docId;
        this.db = db;
        this.title = title;
        this.abs = abs;
        this.authors = authors;
        this.citations = citations;
        this.year = year;
        this.keywords = keywords;
        this.publication = publication;
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

    public ArrayList<AuthorSearchResultVO> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<AuthorSearchResultVO> authors) {
        this.authors = authors;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
