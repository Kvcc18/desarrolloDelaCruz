package com.anahuac.desarrollo.estructura.adapter;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class AdapterA implements IDep {

    private String name;
    DepB depB;

    public AdapterA(DepB depB) {
        this.name = depB.getNombre() + depB.getApellido();
        this.depB = depB;
    }

    @Override
    public void print() {
        System.out.println("Nombre:" + name);
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public int getEdad() {
        long age = ChronoUnit.YEARS.between(depB.bornDate, LocalDate.now());
        return (int) age;
    }

}
