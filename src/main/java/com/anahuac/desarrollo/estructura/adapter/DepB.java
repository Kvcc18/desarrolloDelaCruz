package com.anahuac.desarrollo.estructura.adapter;
import java.time.*;

public class DepB {

    public String name;
    public String lastName;
    public LocalDate bornDate;

    public DepB(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.name = nombre;
        this.lastName = apellido;
        this.bornDate = fechaNacimiento;
    }

    public String getNombre() {
        return name;
    }

    public String getApellido() {
        return lastName;
    }

    public LocalDate getEdad() {
        return bornDate;
    }

    public void print() {
        System.out.println("Nombre: " +  name);
        System.out.println("Appellido: " +  lastName);
        System.out.println("Fecha de nacimiento: " + bornDate);
    }



}
