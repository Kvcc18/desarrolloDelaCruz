package com.anahuac.desarrollo.creacional.factory_method;

public class MongDB implements DBConnect {

    public MongDB() {
        System.out.println("MongDB created");
    }

    public void connect() {
        System.out.println("Connected to MongDB");
    }

    public void disconnect() {
        System.out.println("Disconnected from MongDB");
    }

    public void runQuery(String table) {
        System.out.println("Running query on 'MongDB on table:" + table);
    }
    
    public void createQuery() {
        System.out.println("Creating query on MongDB");
    }
    
    
}
