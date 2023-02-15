package com.anahuac.desarrollo.estructura.decorator;

/**
 * 
 */
public class HBO extends ReciboDecorator {

    public HBO() {
    }

    @Override
    public String descripcion(String rec) {
        return rec + ", HBO";
    }

    @Override
    public float costos(float cost) {
        return cost + 100;
    }

}
