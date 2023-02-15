package com.anahuac.desarrollo.creacional.factory_method;

public class BDR extends DBCreate {
    
    public BDR(String type) {
        this.type = type;
    }

    public DBConnect create_DB(String type) {
        if(type.equals("MySQL")) {
            return new MySQL();
        }
        else if(type.equals("Oracle")) {
            return new ORACLE();
        }
        else{
            return null;
        }
    }

}
