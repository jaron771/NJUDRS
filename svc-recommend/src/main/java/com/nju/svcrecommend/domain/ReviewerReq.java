package com.nju.svcrecommend.domain;

public class ReviewerReq {
    private String title;
    private String authors;
    private String keywords;
    private String publication;

    public ReviewerReq() {
    }

    public ReviewerReq(String title, String authors, String keywords, String publication) {
        this.title = title;
        this.authors = authors;
        this.keywords = keywords;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
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
}
