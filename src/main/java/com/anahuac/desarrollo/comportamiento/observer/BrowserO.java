package com.anahuac.desarrollo.comportamiento.observer;

public class BrowserO implements ObserverV {

    private Subject subject;

    private int precio;

    public BrowserO(Subject subject, int precio) {
        this.subject = subject;
        subject.registerObserver(this);
        this.precio = precio;
    }

    @Override
    public void update() {
        if ((int)subject.getFlag()<this.precio) {
            System.out.println("Mensaje de Navegador: El articulo ha bajado a menos de "+ this.precio);
        }
    }

    @Override
    public void setFlag(Object precio) {
        this.precio = (int)precio;
    }
}
