package com.anahuac.desarrollo.estructura.decorator;

/**
 * 
 */
public class Prime extends ReciboDecorator {

    public Prime() {
    }

    @Override
    public String descripcion(String rec) {
        return rec + ", Prime";
    }

    @Override
    public float costos(float cost) {
        return cost + 50;
    }
}