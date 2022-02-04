package com.nju.svcdisambiguation.vo.detail.institution;

public class InstitutionAuthorActivationVO {
    private int id;
    private String name;
    private double activation;
    private String db;

    public InstitutionAuthorActivationVO() {
    }

    public InstitutionAuthorActivationVO(int id, String name, double activation, String db) {
        this.id = id;
        this.name = name;
        this.activation = activation;
        this.db = db;
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
