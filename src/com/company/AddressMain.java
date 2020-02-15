package com.company;

import java.io.IOException;
import java.util.Enumeration;

public class AddressMain {
    public static void main(String args[]){
        try{
            AddressFile file = new AddressFile("address.txt");
            file.set("Hiroshi Yuki","hyuki@example.com");
            file.set("Tomura","tomura@example.com");
            file.set("Hanako","hanko@example.com");
            file.update();
            Enumeration e  = file.names();

            while (e.hasMoreElements()){
                String name = (String)e.nextElement();
                String mail= file.get(name);
                System.out.println("name = "+name+ ", "+"mail="+mail);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
