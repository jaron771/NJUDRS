package com.nju.svcprediction.domain;

import java.util.ArrayList;

public class Document {
    private String title;
    private String publication;
    private int year;
    private ArrayList<Author> authors;
    private ArrayList<String> keywords;

    public Document() {
    }

    public Document(String title, String publication, int year, ArrayList<Author> authors, ArrayList<String> keywords) {
        this.title = title;
        this.publication = publication;
        this.year = year;
        this.authors = authors;
        this.keywords = keywords;
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

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
}
