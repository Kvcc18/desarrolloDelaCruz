package com.anahuac.desarrollo.creacional.singleton;


public class DBConnect {
    private static DBConnect instance = new DBConnect();
    
    private DBConnect() {}

    public static DBConnect getInstance() {
        return DBConnect.instance;
    }

    public void open() { 
        System.out.print("Conexion realizada con éxito");
    }

    public void consultaA() {
        System.out.print("Resultado consulta A");
    }

    public void consultaB() {
        System.out.print("Resultado consulta B");
    }

}
