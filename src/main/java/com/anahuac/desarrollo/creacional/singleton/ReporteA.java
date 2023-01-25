package com.anahuac.desarrollo.creacional.singleton;


public class ReporteA {

  public String informacionA;

  public String getInformacionA() { 
    return informacionA;
  }

  public void setInformacionA(String informacionA) {
    this.informacionA = informacionA;
  }

  public void print() {
    DBConnect informacionA = DBConnect.getInstance();
    informacionA.open();
    informacionA.consultaA();
  }

}
