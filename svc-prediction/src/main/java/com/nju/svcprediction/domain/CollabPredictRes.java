package com.nju.svcprediction.domain;

public class CollabPredictRes {
    private int category;
    private String affiliationName;
    private String authorName;
    private int id;
    private double activation;
    private String db;

    public CollabPredictRes() {
    }

    public CollabPredictRes(int category, String affiliationName, String authorName, int id, double activation, String db) {
        this.category = category;
        this.affiliationName = affiliationName;
        this.authorName = authorName;
        this.id = id;
        this.activation = activation;
        this.db = db;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getAffiliationName() {
        return affiliationName;
    }

    public void setAffiliationName(String affiliationName) {
        this.affiliationName = affiliationName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getActivation() {
        return activation;
    }

    public void setActivation(double activation) {
        this.activation = activation;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
