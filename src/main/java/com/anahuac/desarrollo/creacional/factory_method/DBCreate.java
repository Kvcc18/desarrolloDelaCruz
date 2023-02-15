package com.anahuac.desarrollo.creacional.factory_method;

public abstract class DBCreate {

    public String type;

    public abstract DBConnect create_DB(String type);

    public void consultarReporte(String tabla) {
        
        DBConnect db = create_DB(this.type);
        db.connect();
        db.createQuery();
        db.runQuery(tabla);
        db.disconnect();
    }
    
}
