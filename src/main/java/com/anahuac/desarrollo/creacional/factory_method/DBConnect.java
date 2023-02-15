package com.anahuac.desarrollo.creacional.factory_method;

public interface DBConnect {
    void connect();
    void disconnect();
    void runQuery(String table);
    void createQuery();

}
