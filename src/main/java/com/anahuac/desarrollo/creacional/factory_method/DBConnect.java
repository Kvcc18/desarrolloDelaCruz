package com.anahuac.desarrollo.creacional.factory_method;

public class DBConnect {
    
    private static DBConnect instance = new DBConnect();
    
    private DBConnect() {}

    public static DBConnect getInstance() {
        return DBConnect.instance;
    }

    public void open() { 
        System.out.print("Conexion realizada con éxito");
    }

}
