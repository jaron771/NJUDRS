package com.nju.svcdisambiguation.po;

public class PaperInstitutionsPO {

    private int id;
    private String name;
    private String db;

    public PaperInstitutionsPO() {
    }

    public PaperInstitutionsPO(String name, int id, String db) {
        this.name = name;
        this.id = id;
        this.db = db;
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
}
