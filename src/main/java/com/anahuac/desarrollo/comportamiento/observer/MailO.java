package com.anahuac.desarrollo.comportamiento.observer;

public class MailO implements ObserverV {

    private Subject subject;

    private int precio;

    public MailO(Subject subject, int precio) {
        this.subject = subject;
        subject.registerObserver(this);
        this.precio = precio;
    }

    @Override
    public void setFlag(Object precio) {
        this.precio = (int)precio;
    }

    @Override
    public void update() {
        if ((int)subject.getFlag()>this.precio) {
            System.out.println("Mensaje Mail: El articulo está a menos de "+ this.precio);
        }
    }
    
}
