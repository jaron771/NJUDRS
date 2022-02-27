package com.nju.svcprediction.domain;

public class Edge {
    private int v1;
    private int v2;
    private EdgeContent content;

    public Edge() {
    }

    public Edge(int v1, int v2, EdgeContent content) {
        this.v1 = v1;
        this.v2 = v2;
        this.content = content;
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

    public EdgeContent getContent() {
        return content;
    }

    public void setContent(EdgeContent content) {
        this.content = content;
    }
}

