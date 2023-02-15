package com.anahuac.desarrollo.comportamiento.strategy;

public class BurbujaSort implements SortBehavior {
    public void sort(int[] lista) {
        for(int i=0;i<lista.length;i++) {
            System.out.print(lista[i]+"  ");
        }
        System.out.println("Ordenado por metodo Burbuja \n");
    }
}
