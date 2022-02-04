package com.nju.svcdisambiguation.vo.detail.institution;

public class InstitutionAuthorStatVO {
    private int id;
    private String name;
    private int paperCount;
    private String db;

    public InstitutionAuthorStatVO() {
    }

    public InstitutionAuthorStatVO(int id, String name, int paperCount, String db) {
        this.id = id;
        this.name = name;
        this.paperCount = paperCount;
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

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
