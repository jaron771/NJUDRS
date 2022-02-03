package com.nju.svcdisambiguation.po;

public class CalLengthPO {
    private int id;
    private String name;
    private int length;

    public CalLengthPO() {
    }

    public CalLengthPO(int id, String name, int length) {
        this.id = id;
        this.name = name;
        this.length = length;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + length;
    }
}
