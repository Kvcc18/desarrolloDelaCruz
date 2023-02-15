package com.anahuac.desarrollo.comportamiento.template;

public class Evento {
    private String tipo = "";
    private String fecha = "";
    private String hora = "";
    private String msg = "";

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Evento(String tipo, String fecha, String hora, String msg) {
        super();
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.msg = msg;
    }
}
