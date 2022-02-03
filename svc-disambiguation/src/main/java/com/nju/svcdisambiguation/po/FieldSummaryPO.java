package com.nju.svcdisambiguation.po;

public class FieldSummaryPO {
    private int fieldId;
    private String fieldName;
    private int count;

    public FieldSummaryPO() {
    }

    public FieldSummaryPO(int fieldId, String fieldName, int count) {
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.count = count;
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
}
