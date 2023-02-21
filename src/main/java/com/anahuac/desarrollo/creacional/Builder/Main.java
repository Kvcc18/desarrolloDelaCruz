package com.anahuac.desarrollo.creacional.Builder;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop.LaptopBuilder()
                .ssd("SSD")
                .cpu("i7")
                .os("Windows 8")
                .ram("5GB")
                .teclado("Logitech")
                .build();

    }
}
