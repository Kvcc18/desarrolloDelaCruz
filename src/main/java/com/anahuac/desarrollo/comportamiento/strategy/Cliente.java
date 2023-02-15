package com.anahuac.desarrollo.comportamiento.strategy;

public class Cliente {

    public static void main(String[] args) {
        SortBehavior burbuja = new BurbujaSort();
        SortBehavior quick = new QuickSort();
        SortBehavior shell = new ShellSort();
        SortBehavior insertion = new InsertionShort();
        ListaNum test = new ListaNum();
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        test.setNums(a);
        test.setSortBehavior(burbuja);
        test.performSort();
        test.setSortBehavior(quick);
        test.performSort();
        test.setSortBehavior(shell);
        test.performSort();
        test.setSortBehavior(insertion);
        test.performSort();

    }
    
}
