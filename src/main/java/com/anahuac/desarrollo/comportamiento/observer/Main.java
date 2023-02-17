package com.anahuac.desarrollo.comportamiento.observer;

public class Main {

    public static  void main(String[] args) {

        Subject subject1 = new Article();
        ObserverV Browser = new BrowserO(subject1, 150);
        ObserverV Mail = new MailO(subject1, 150);
        ObserverV WhatsApp = new WhatsAppO(subject1, 150);
        subject1.setFlag(160);
        Browser.setFlag(120);
        Mail.setFlag(120);
        WhatsApp.setFlag(120);
        subject1.setFlag(100);
    }
}
