package com.anahuac.desarrollo.estructura.proxy;
import java.util.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> paginas = new ArrayList<String>();
        paginas.add("www.facebook.com");
        paginas.add("www.instagram.com");
        paginas.add("www.tiktok.com");

        Ppagina pagina = new Ppagina(paginas);
        Usuario usuario1 = new Usuario(true, "Karla estudiante");
        Usuario usuario2 = new Usuario(true, "Vianey profesor");

        pagina.open("www.facebook.com", usuario2);
        pagina.open("www.google.com", usuario1);
        pagina.open("www.tiktok.com", usuario1);

    }
}
