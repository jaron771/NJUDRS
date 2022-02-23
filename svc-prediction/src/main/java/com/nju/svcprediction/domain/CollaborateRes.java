package com.nju.svcprediction.domain;

import java.util.ArrayList;

public class CollaborateRes {
    private ArrayList<Veticle> veticles;
    private ArrayList<Edge> edges;

    public CollaborateRes() {
    }

    public CollaborateRes(ArrayList<Veticle> veticles, ArrayList<Edge> edges) {
        this.veticles = veticles;
        this.edges = edges;
    }

    public ArrayList<Veticle> getVeticles() {
        return veticles;
    }

    public void setVeticles(ArrayList<Veticle> veticles) {
        this.veticles = veticles;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }
}
