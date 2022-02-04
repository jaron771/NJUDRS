package com.nju.svcdisambiguation.vo.detail.author;

public class KeywordsAuthorDetailVO {
    private int id;
    private String name;
    private double activation;
    private int docCount;

    public KeywordsAuthorDetailVO() {
    }

    public KeywordsAuthorDetailVO(int id, String name, double activation, int docCount) {
        this.id = id;
        this.name = name;
        this.activation = activation;
        this.docCount = docCount;
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

    public int getDocCount() {
        return docCount;
    }

    public void setDocCount(int docCount) {
        this.docCount = docCount;
    }
}
