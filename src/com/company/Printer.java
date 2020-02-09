package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Printer {

    public static final int TYPECODE_DIGIT = 0;
    public static final int TYPECODE_GRAPHIC = 1;

    private int typecode;

    public Printer(int typecode){
        this.typecode =typecode;
    }

    public void println(int n){
        switch (typecode){
            case TYPECODE_DIGIT:
                for (int i=0;i<n;i++){
                    System.out.println("*");
                }
                System.out.printf(" (%d) ",n);
                System.out.println();
                break;

            case TYPECODE_GRAPHIC:
                System.out.println(n);
        }

    }

}
