package com.anahuac.desarrollo.estructura.decorator;

public class Controlador {
    public static void main(String[] args) {
        Recibo servicio1 = new ReciboBase("18/04/22");
        ReciboDecorator prime = new Prime();
        ReciboDecorator hbo = new HBO();
        ReciboDecorator disney = new Disney();
        System.out.println(servicio1.descripcion());
        System.out.println(prime.descripcion(servicio1.descripcion()));
        System.out.println(hbo.descripcion(servicio1.descripcion));
        System.out.println(disney.descripcion(servicio1.descripcion));
        System.out.println(disney.descripcion(prime.descripcion((hbo.descripcion(servicio1.descripcion)))));

        System.out.println("El costo es: $" + servicio1.costos());
        System.out.println("El costo es: $" +prime.costos(servicio1.costos()));
        System.out.println("El costo es: $" +hbo.costos(servicio1.costos()));
        System.out.println("El costo es: $" +disney.costos(servicio1.costos()));
        System.out.println("El costo es: $" +disney.costos(prime.costos(hbo.costos(servicio1.costos()))));
    }
}