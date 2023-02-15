package com.anahuac.desarrollo.creacional.factory_method;

public class MySQL implements DBConnect {

    public MySQL() {
        System.out.println("MySQL created");
    }

    public void connect() {
        System.out.println("Connected to MySQL");
    }

    public void disconnect() {
        System.out.println("Disconnected from MySQL");
    }

    public void runQuery(String table) {
        System.out.println("Running query on 'MySQL on table:" + table);
    }
    
    public void createQuery() {
        System.out.println("Creating query on MySQL");
    }
    
}
