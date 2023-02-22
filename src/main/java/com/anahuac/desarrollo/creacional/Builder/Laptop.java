package com.anahuac.desarrollo.creacional.Builder;

public class Laptop {

    private String ssd;
    private String ram;
    private String cpu;
    private String teclado;
    private String os;

    private Laptop(LaptopBuilder builder) {
        this.ssd = builder.ssd;
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.teclado = builder.teclado;
        this.os = builder.os;
    }

    public static class LaptopBuilder {
        private String ssd;
        private String ram;
        private String cpu;
        private String teclado;
        private String os;

        public LaptopBuilder() {
            System.out.println("Laptop construida");
        }

        public LaptopBuilder ssd (String ssd) {
            this.ssd = ssd;
            System.out.println("Ssd agregada" + ssd);
            return this;
        }

        public  LaptopBuilder ram (String ram) {
            this.ram = ram;
            System.out.println("Ram agregada" + ram);
            return this;
        }

        public LaptopBuilder cpu (String cpu) {
            this.cpu = cpu;
            System.out.println("CPU agregada" + cpu);
            return this;
        }

        public LaptopBuilder teclado (String teclado) {
            this.teclado = teclado;
            System.out.println("Teclado agregado" + teclado);
            return this;
        }

        public LaptopBuilder os (String os) {
            this.os = os;
            System.out.println("OS agregada" + os);
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }

    }

}
