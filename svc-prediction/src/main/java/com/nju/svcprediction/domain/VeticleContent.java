package com.nju.svcprediction.domain;

public class VeticleContent{
    private double activation;
    private String affiliation;
    private int affiliationId;
    private int documentCount;
    private int id;
    private String name;
    private String db;

    public VeticleContent() {
    }

    public VeticleContent(double activation, String affiliation, int affiliationId, int documentCount, int id, String name, String db) {
        this.activation = activation;
        this.affiliation = affiliation;
        this.affiliationId = affiliationId;
        this.documentCount = documentCount;
        this.id = id;
        this.name = name;
        this.db = db;
    }

    public double getActivation() {
        return activation;
    }

    public void setActivation(double activation) {
        this.activation = activation;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public int getAffiliationId() {
        return affiliationId;
    }

    public void setAffiliationId(int affiliationId) {
        this.affiliationId = affiliationId;
    }

    public int getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(int documentCount) {
        this.documentCount = documentCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
