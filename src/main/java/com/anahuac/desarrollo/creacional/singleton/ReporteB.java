package com.anahuac.desarrollo.creacional.singleton;

public class ReporteB {
    
    public String informacionB;

    public String getInformacionB() {
        return informacionB;
    }

    public void setInformacionB(String informacionB) {
        this.informacionB = informacionB;
    }

    public void print() {
        DBConnect informacionB = DBConnect.getInstance();
        informacionB.open();
        informacionB.consultaB();
    }
}
