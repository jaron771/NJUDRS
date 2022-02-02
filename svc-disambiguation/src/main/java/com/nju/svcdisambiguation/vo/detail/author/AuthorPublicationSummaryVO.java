package com.nju.svcdisambiguation.vo.detail.author;

import java.util.ArrayList;

public class AuthorPublicationSummaryVO {
    private String publication;
    private int docCount;

    public AuthorPublicationSummaryVO() {
    }

    public AuthorPublicationSummaryVO(String publication, int docCount) {
        this.publication = publication;
        this.docCount = docCount;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getDocCount() {
        return docCount;
    }

    public void setDocCount(int docCount) {
        this.docCount = docCount;
    }
}
