package com.anahuac.desarrollo.estructura.adapter;
import java.time.*;

public class Cliente {
    public static void main(String[] args) {
        DepB depB = new DepB("Karla", "Cicler", LocalDate.parse("18/04/02"));
        DepA depA = new DepA("Karla de la Cruz", 20);
        depA.print();
        AdapterA adapterA = new AdapterA(depB);
        adapterA.print();
    }
}
