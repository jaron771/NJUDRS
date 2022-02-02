package com.nju.svcdisambiguation.vo.detail.author;

public class AuthorReferredVO {
    private int referred;

    public AuthorReferredVO() {
    }

    public AuthorReferredVO(int referred) {
        this.referred = referred;
    }

    public int getReferred() {
        return referred;
    }

    public void setReferred(int referred) {
        this.referred = referred;
    }
}
