package com.nju.svcprediction.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EdgePO {
    private int v1;
    private int v2;
    private int commonWorks;

    public EdgePO() {
    }

    public EdgePO(int v1, int v2, int commonWorks) {
        this.v1 = v1;
        this.v2 = v2;
        this.commonWorks = commonWorks;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getCommonWorks() {
        return commonWorks;
    }

    public void setCommonWorks(int commonWorks) {
        this.commonWorks = commonWorks;
    }
}
