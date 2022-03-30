package com.nju.svcrecommend.domain;

import java.util.ArrayList;

public class ReviewerRes {
    private String name;
    private int id;
    private String db;
    private ArrayList<String> institutions;
    private ArrayList<String> keywords;

    public ReviewerRes() {
    }

    public ReviewerRes(String name, int id, String db, ArrayList<String> institutions, ArrayList<String> keywords) {
        this.name = name;
        this.id = id;
        this.db = db;
        this.institutions = institutions;
        this.keywords = keywords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<String> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(ArrayList<String> institutions) {
        this.institutions = institutions;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
}
