package com.nju.svcdisambiguation.po;

public class PaperActivationPO {
    private int docId;
    private int year;
    private int citations;

    public PaperActivationPO() {
    }

    public PaperActivationPO(int docId, int year, int citations) {
        this.docId = docId;
        this.year = year;
        this.citations = citations;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }
}
