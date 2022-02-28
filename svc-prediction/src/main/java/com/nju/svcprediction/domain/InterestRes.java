package com.nju.svcprediction.domain;

public class InterestRes {

    private int year;
    private String word;

    public InterestRes() {
    }

    public InterestRes(int year, String word) {
        this.year = year;
        this.word = word;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
