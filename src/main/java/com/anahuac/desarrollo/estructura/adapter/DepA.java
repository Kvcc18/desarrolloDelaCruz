package com.anahuac.desarrollo.estructura.adapter;

public class DepA implements IDep {

    private String name;
    private int age;

    public DepA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: "+ age);
    }

    @Override
    public String getNombre() {
        return name;
    }

    @Override
    public int getEdad() {
        return age;
    }

}
