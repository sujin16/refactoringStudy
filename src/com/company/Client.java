package com.company;

public class Client {

    private final Printer printer;

    public Client (boolean graphic){
        if(graphic){
            printer =new GraphPrinter();
        }else{
            printer = new DigitPrinter();
        }
    }
    public void excute(){
        int [] table = {3,1,4,1,5,9};
        for( int n: table){
            printer.println(n);
        }
    }
}
