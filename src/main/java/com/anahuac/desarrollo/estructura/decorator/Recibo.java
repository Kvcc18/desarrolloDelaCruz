package com.anahuac.desarrollo.estructura.decorator;

import java.util.*;

/**
 * 
 */
public abstract class Recibo {
    public String fecha;
    public float costos;
    public String descripcion;

    public abstract String descripcion();
    public abstract float costos();
}