package com.nju.svcdisambiguation.service;

public interface DisambiguationService {

    double getAuthorSimilarity(String db, int id1, int id2);

    double getInsSimilarity(String db, int id1, int id2);

    void startAuthorDisambiguation(String db, char alpha, int length);

    void calLength(String table, String db);

    void startInsDisambiguation(String db, char alpha, int length);
}
