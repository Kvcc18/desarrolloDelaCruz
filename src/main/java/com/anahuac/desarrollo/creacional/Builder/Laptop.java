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

        public LaptopBuilder() { }

        public void setSsd(String ssd) {
            this.ssd = ssd;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public void setTeclado(String teclado) {
            this.teclado = teclado;
        }

        public void setOs(String os) {
            this.os = os;
        }

    }

}
