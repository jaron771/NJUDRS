package com.nju.svcdisambiguation.vo.detail.institution;

import java.util.ArrayList;

public class InstitutionInfoVO {
    private int id;
    private String name;
    private int paperCount;
    private int authorCount;
    private int citeCount;
    private String db;
    private ArrayList<String> sameIns;

    public InstitutionInfoVO() {
        sameIns = new ArrayList<>();
    }

    public InstitutionInfoVO(int id, String name, int paperCount, int authorCount, int citeCount, String db, ArrayList<String> sameIns) {
        this.id = id;
        this.name = name;
        this.paperCount = paperCount;
        this.authorCount = authorCount;
        this.citeCount = citeCount;
        this.db = db;
        this.sameIns = sameIns;
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

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    public int getAuthorCount() {
        return authorCount;
    }

    public void setAuthorCount(int authorCount) {
        this.authorCount = authorCount;
    }

    public int getCiteCount() {
        return citeCount;
    }

    public void setCiteCount(int citeCount) {
        this.citeCount = citeCount;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public ArrayList<String> getSameIns() {
        return sameIns;
    }

    public void setSameIns(ArrayList<String> sameIns) {
        this.sameIns = sameIns;
    }
}
