package com.anahuac.desarrollo.creacional.factory_method;

public class Main {
    
    public static void main( String[] args) {

        DBCreate db = new BDR("MySQL");
        RepA reporte = new RepA(db);
        reporte.verReporte();
    }
}
