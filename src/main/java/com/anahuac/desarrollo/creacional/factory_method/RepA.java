package com.anahuac.desarrollo.creacional.factory_method;

public class RepA {

    DBCreate db;
    public RepA(DBCreate db) {
        this.db = db;
    }
    
    public void verReporte() {
        this.db.consultarReporte("Tabla");
    }
    
}
