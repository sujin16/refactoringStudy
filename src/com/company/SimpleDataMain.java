package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class SimpleDataMain {
    public static void main(String args[]){
       try{
           String path = SimpleDatabase.class.getResource("").getPath();
           File file = new File(path+"dbfile.txt");
           SimpleDatabase db =new SimpleDatabase(new FileReader(file));
           Iterator<String> it =db.iterator();

           while (it.hasNext()){
               String key = it.next();
               System.out.println("key : " +key);
               System.out.println("value : "+db.getValue(key));
               System.out.println();
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
