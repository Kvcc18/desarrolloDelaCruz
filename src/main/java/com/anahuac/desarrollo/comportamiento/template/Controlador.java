package com.anahuac.desarrollo.comportamiento.template;

public class Controlador {

    public static void main(String[]args) {
        Evento evento1 =
                new Evento("Warning", "14 de feb", "8:40", "Alerta");

        Logger log1 = new LoggerTXT();
        log1.write(evento1);
        System.out.println("");

        Logger log2 = new LoggerTXT();
        log2.write(evento1);
        System.out.println("");

        Logger log3 = new LoggerTXT();
        log3.write(evento1);
        System.out.println("");
    }
}
