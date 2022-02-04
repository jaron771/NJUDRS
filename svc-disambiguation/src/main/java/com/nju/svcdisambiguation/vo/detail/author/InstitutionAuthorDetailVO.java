package com.nju.svcdisambiguation.vo.detail.author;

public class InstitutionAuthorDetailVO {
    private int id;
    private String db;
    private String name;

    public InstitutionAuthorDetailVO() {
    }

    public InstitutionAuthorDetailVO(int id, String db, String name) {
        this.id = id;
        this.db = db;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
