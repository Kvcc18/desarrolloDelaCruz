package com.anahuac.desarrollo.estructura.decorator;

/**
 * 
 */
public class Disney extends ReciboDecorator {


    public Disney() {
    }

    @Override
    public String descripcion(String rec) {
        return rec + ", y Disney";
    }

    @Override
    public float costos(float cost) {
        return cost + 100;
    }

}