package com.anahuac.desarrollo.estructura.proxy;
import java.util.ArrayList;

public class Ppagina implements Acceso {
    private Pagina pagina;
    private ArrayList<String> pagban;

    Ppagina(ArrayList<String> pagban) {
        this.pagina = new Pagina();
        this.pagban = pagban;
    }

    public void open(String nombre, Usuario usuario) {
        if (this.pagban.contains(nombre)||usuario.isPermiso()) {
            this.pagina.open(nombre, usuario);
        }
        else {
            System.out.println("La pagina " + nombre + " está bloqueada para el usuario " +  usuario.getNombre());
        }
    }

}
