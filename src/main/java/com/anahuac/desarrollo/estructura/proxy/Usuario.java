package com.anahuac.desarrollo.estructura.proxy;

public class Usuario {
    private boolean permiso;
    private String nombre;


    public Usuario(boolean permiso, String nombre) {
        this.permiso = permiso;
        this.nombre = nombre;
    }

    public boolean isPermiso() {
        return permiso;
    }

    public void setPermiso(boolean permiso) {
        this.permiso = permiso;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
