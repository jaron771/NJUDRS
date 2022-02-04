package com.nju.svcdisambiguation.vo.detail.institution;


public class InstitutionFieldSummaryVO {
    private int fieldId;
    private String fieldName;
    private int count;
    private String db;

    public InstitutionFieldSummaryVO() {
    }

    public InstitutionFieldSummaryVO(int fieldId, String fieldName, int count, String db) {
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.count = count;
        this.db = db;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}

