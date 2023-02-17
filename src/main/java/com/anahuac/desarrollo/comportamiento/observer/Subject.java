package com.anahuac.desarrollo.comportamiento.observer;

import sun.jvm.hotspot.utilities.Observer;

public interface Subject {

    public void setFlag(Object o);
    public Object getFlag();
    public void registerObserver(ObserverV o);
    public void removeObserver(ObserverV o);
    public void updateObservers();
}
