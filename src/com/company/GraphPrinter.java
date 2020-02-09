package com.company;

public class GraphPrinter extends Printer {
    @Override
    public void println(int n) {
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
        System.out.printf("(%d)",n);
        System.out.println();
    }
}
