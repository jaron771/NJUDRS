package com.nju.svcdisambiguation.vo.search;

public class AuthorSearchResultVO {
    private int id;
    private String db;
    private String name;
    private String institution;

    public AuthorSearchResultVO() {
    }

    public AuthorSearchResultVO(int id, String db, String name, String institution) {
        this.id = id;
        this.db = db;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
