package com.nju.svcrecommend.domain;

public class AuthorVO {
    private int id;
    private String name;
    private String db;
    private String institution;

    public AuthorVO() {
    }

    public AuthorVO(int id, String name, String db, String institution) {
        this.id = id;
        this.name = name;
        this.db = db;
        this.institution = institution;
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
