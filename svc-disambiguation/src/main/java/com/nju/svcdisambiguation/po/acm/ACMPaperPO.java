package com.nju.svcdisambiguation.po.acm;

public class ACMPaperPO {
    private int document_id;
    private String title;
    private String abs;
    private String publication;
    private int year;

    public ACMPaperPO() {
    }

    public ACMPaperPO(int document_id, String title, String abs, String publication, int year) {
        this.document_id = document_id;
        this.title = title;
        this.abs = abs;
        this.publication = publication;
        this.year = year;
    }

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
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
}
