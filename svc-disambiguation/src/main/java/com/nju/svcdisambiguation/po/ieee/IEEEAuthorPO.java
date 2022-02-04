package com.nju.svcdisambiguation.po.ieee;

public class IEEEAuthorPO {
    private int id;
    private String name;
    private String affiliation;

    public IEEEAuthorPO() {
    }

    public IEEEAuthorPO(int id, String name, String affiliation) {
        this.id = id;
        this.name = name;
        this.affiliation = affiliation;
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

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
}
