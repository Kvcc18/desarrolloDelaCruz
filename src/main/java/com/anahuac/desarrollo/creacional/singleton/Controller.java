package com.anahuac.desarrollo.creacional.singleton;

public class Controller {

    public static void main (String[] args) {
        ReporteA repA = new ReporteA();
        ReporteB repB = new ReporteB();
        repA.print();
        repB.print();        
    }
}
