package com.anahuac.desarrollo.estructura.decorator;

import com.anahuac.desarrollo.estructura.decorator.Recibo;

/**
 * 
 */
public class ReciboBase extends Recibo {

    public ReciboBase(String fecha) {
        this.fecha = fecha;
        this.costos = 200;
        this.descripcion = "El servicio base incluye renta del telefono";
    }

    @Override
    public String descripcion() {
        return this.descripcion + "fecha de vencimiento: " + this.fecha;
    }

    @Override
    public float costos() {
        return this.costos;
    }

}