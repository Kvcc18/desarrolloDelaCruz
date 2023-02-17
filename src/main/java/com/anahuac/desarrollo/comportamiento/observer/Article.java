package com.anahuac.desarrollo.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Article implements Subject {

    private int precio;

    private List<ObserverV> observers = new ArrayList<ObserverV>();

    @Override
    public void setFlag(Object precio) {
        this.precio = (int)precio;
        updateObservers();
    }

    @Override
    public Object getFlag() {
        return precio;
    }

    @Override
    public void registerObserver(ObserverV o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(ObserverV o) {
        this.observers.remove(o);
    }

    @Override
    public void updateObservers() {
        for (ObserverV o: this.observers) {
            o.update();
        }
    }
}
