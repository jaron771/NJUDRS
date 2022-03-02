package com.nju.svcprediction.domain;

import java.util.ArrayList;

public class Veticle {
    private boolean core;
    private int id;
    private int category;
    private VeticleContent content;

    public Veticle() {
    }

    public Veticle(boolean core, int id, int category, VeticleContent content) {
        this.core = core;
        this.id = id;
        this.category = category;
        this.content = content;
    }

    public boolean isCore() {
        return core;
    }

    public void setCore(boolean core) {
        this.core = core;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public VeticleContent getContent() {
        return content;
    }

    public void setContent(VeticleContent content) {
        this.content = content;
    }
}

