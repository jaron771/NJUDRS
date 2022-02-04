package com.nju.svcdisambiguation.vo.search;

import java.util.ArrayList;

public class SearchResultCitationVO {
    private ArrayList<DSRRankedByCitationsVO> documents;
    private int total;

    public SearchResultCitationVO() {
    }

    public SearchResultCitationVO(ArrayList<DSRRankedByCitationsVO> documents, int total) {
        this.documents = documents;
        this.total = total;
    }

    public ArrayList<DSRRankedByCitationsVO> getdocuments() {
        return documents;
    }

    public void setdocuments(ArrayList<DSRRankedByCitationsVO> documents) {
        this.documents = documents;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
