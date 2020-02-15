package com.company;
import  java.util.*;
//Database class을 이용하고 있는 username과 mail address 을 관리
public class AddressFile {
    private final Database database;

    public AddressFile(String filename) {
        this.database = new Database(filename);
    }

    public Database getDatabase(){return  database;}

    //Enumeration interface :  객체들의 집합(Vector)에서 각각의 객체들을 한순간에 하나씩 처리할 수 있는 메소드를 제공하는 켈렉션이다.
    public Enumeration names(){ return database.getProperties().propertyNames();}
}
