package com.anahuac.desarrollo.creacional.factory_method;

public class ORACLE implements DBConnect {

    public ORACLE() { 
        System.out.println("Oracle created");
    }

    public void connect() {
        System.out.println("Connected to Oracle");
    }

    public void disconnect() {
        System.out.println("Disconnected from Oracle");
    }

    public void runQuery(String table) {
        System.out.println("Running query on 'Oracle on table:" + table);
    }
    
    public void createQuery() {
        System.out.println("Creating query on Oracle");
    }
}


