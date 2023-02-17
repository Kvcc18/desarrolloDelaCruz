package com.anahuac.desarrollo.estructura.proxy;

public class Pagina implements Acceso {
    public void open(String nombre, Usuario usuario) {
        System.out.println("Abriendo la página " + nombre);
    }
}
