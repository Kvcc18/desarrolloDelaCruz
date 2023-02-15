package com.anahuac.desarrollo.comportamiento.template;

public class LoggerCSV extends Logger {

    public void format(Evento evento) {
        System.out.println(evento.getTipo()+","+evento.getHora()+
                ","+evento.getFecha()+","+evento.getMsg());
    }
}
