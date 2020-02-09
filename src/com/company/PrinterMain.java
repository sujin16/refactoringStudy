package com.company;

public class PrinterMain {
    public static void main(String args[]){

        /*
         챌 예제
         new Client(false).exccute();
         new Client(true).exccute();

        1. Print class와 Client Class 수정
        2. Client Class와 Main Class 수정
         */

        new Client(Printer.TYPECODE_DIGIT).execute();
        new Client(Printer.TYPECODE_GRAPHIC).execute();


    }
}
