package com.nju.svcprediction.domain;

public class Author {
    private int id;
    private String name;
    private String ins;

    public Author() {
    }

    public Author(int id, String name, String ins) {
        this.id = id;
        this.name = name;
        this.ins = ins;
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

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins;
    }
}
