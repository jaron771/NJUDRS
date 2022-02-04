package com.nju.svcdisambiguation.po.ieee;

public class IEEEPaperPO {
    private int document_id;
    private String title;
    private String abs;
    private String keywords;
    private String publication;
    private int citation_count;
    private int publish_year;

    public IEEEPaperPO() {
    }

    public IEEEPaperPO(int document_id, String title, String abs, String keywords, String publication, int citation_count, int publish_year) {
        this.document_id = document_id;
        this.title = title;
        this.abs = abs;
        this.keywords = keywords;
        this.publication = publication;
        this.citation_count = citation_count;
        this.publish_year = publish_year;
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

    public int getCitation_count() {
        return citation_count;
    }

    public void setCitation_count(int citation_count) {
        this.citation_count = citation_count;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }

}
