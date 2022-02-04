package com.nju.svcdisambiguation.vo.search;

import java.util.ArrayList;

public class SearchResultTimeVO {
    private ArrayList<DSRRankedByTimeVO> documents;
    private int total;

    public SearchResultTimeVO() {
    }

    public SearchResultTimeVO(ArrayList<DSRRankedByTimeVO> documents, int total) {
        this.documents = documents;
        this.total = total;
    }

    public ArrayList<DSRRankedByTimeVO> getdocuments() {
        return documents;
    }

    public void setdocuments(ArrayList<DSRRankedByTimeVO> documents) {
        this.documents = documents;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
