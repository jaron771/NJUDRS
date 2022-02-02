package com.nju.svcdisambiguation.po;

public class AuthorInstitutionsPO {
    private int time;
    private String institution;
    private int id;
    private String db;

    public AuthorInstitutionsPO() {
    }

    public AuthorInstitutionsPO(int time, String institution, int id, String db) {
        this.time = time;
        this.institution = institution;
        this.id = id;
        this.db = db;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
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
