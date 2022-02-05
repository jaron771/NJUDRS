package com.nju.svcdisambiguation.po;

public class SameAuthorPO {
    private int id;
    private String name;
    private String db;

    public SameAuthorPO() {
    }

    public SameAuthorPO(int id, String name, String db) {
        this.id = id;
        this.name = name;
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

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
