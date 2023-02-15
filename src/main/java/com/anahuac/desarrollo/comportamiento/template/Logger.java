package com.anahuac.desarrollo.comportamiento.template;

public abstract class Logger {

    public void open() {
            System.out.println("Abriendo archivo");
    }

    public abstract void format(Evento evento);

    public void save() {
        System.out.println("Guardando archivo");
    }

    public void close() {
        System.out.println("Cerrando archivo");
    }

    public final void write(Evento evento) {
        open();
        format(evento);
        save();
        close();
    }
}
