package com.nju.svcdisambiguation.vo.detail.author;

import java.util.ArrayList;

public class AuthorDetailVO {
    private int id;
    private String name;
    private ArrayList<String> sameAuthors;
    private double activation;
    private int docCount;
    private int totalCitations;
    private ArrayList<InstitutionAuthorDetailVO> institution;
    private ArrayList<KeywordsAuthorDetailVO> fieldList;

    public AuthorDetailVO() {
    }

    public AuthorDetailVO(int id, String name, ArrayList<String> sameAuthors, double activation, int docCount, int totalCitations, ArrayList<InstitutionAuthorDetailVO> institution, ArrayList<KeywordsAuthorDetailVO> fieldList) {
        this.id = id;
        this.name = name;
        this.sameAuthors = sameAuthors;
        this.activation = activation;
        this.docCount = docCount;
        this.totalCitations = totalCitations;
        this.institution = institution;
        this.fieldList = fieldList;
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

    public ArrayList<String> getSameAuthors() {
        return sameAuthors;
    }

    public void setSameAuthors(ArrayList<String> sameAuthors) {
        this.sameAuthors = sameAuthors;
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

    public int getTotalCitations() {
        return totalCitations;
    }

    public void setTotalCitations(int totalCitations) {
        this.totalCitations = totalCitations;
    }

    public ArrayList<InstitutionAuthorDetailVO> getInstitution() {
        return institution;
    }

    public void setInstitution(ArrayList<InstitutionAuthorDetailVO> institution) {
        this.institution = institution;
    }

    public ArrayList<KeywordsAuthorDetailVO> getFieldList() {
        return fieldList;
    }

    public void setFieldList(ArrayList<KeywordsAuthorDetailVO> fieldList) {
        this.fieldList = fieldList;
    }
}

