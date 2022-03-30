package com.nju.svcrecommend.domain;

import java.util.ArrayList;

public class SLRVO {
    private ArrayList<PaperVO> documents;
    private int total;

    public SLRVO() {
    }

    public SLRVO(ArrayList<PaperVO> documents, int total) {
        this.documents = documents;
        this.total = total;
    }

    public ArrayList<PaperVO> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<PaperVO> documents) {
        this.documents = documents;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
