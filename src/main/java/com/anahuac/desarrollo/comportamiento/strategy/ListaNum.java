package com.anahuac.desarrollo.comportamiento.strategy;

public class ListaNum {
    public int[] lista;
    private SortBehavior sortBehavior;
    public void setSortBehavior(SortBehavior sb) {
        this.sortBehavior = sb;
    }
    public void setNums(int[] lista) {
        this.lista = lista;
    }
    public void performSort() {
        this.sortBehavior.sort(lista);
    }
    
}
