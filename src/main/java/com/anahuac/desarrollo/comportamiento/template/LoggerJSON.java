package com.anahuac.desarrollo.comportamiento.template;

public class LoggerJSON extends Logger {

    public void format(Evento evento) {
            System.out.println("{'tipo':"+ evento.getTipo()+"}\n"+ "{'hora':" +evento.getHora()+
                    "}\n"+ "{'fecha':"+ evento.getFecha()+"}\n"+ "{'Msg':" +evento.getMsg()+"}\n");
    }
}
