package com.company;


//Client clas가 Printer class만 의존하도록
public class Client {

    private final Printer printer;

    public Client (int typecode){
        this.printer = new Printer(typecode);

    }
    public void execute(){
        int [] table = {3,1,4,1,5,9};
        for( int n: table){
            printer.println(n);
        }
    }
}
