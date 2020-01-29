package com.company;

public class ItemMain {
    public static void main(String args[]){
        Item book = new Item(
                Item.TYPECODE_BOOK,
                "world histoty",
                4800
        );
        Item dvd = new Item(
                Item.TYPECODE_DVD,
                "dream of newYork",
                3000
        );
        Item soft = new Item(
                Item.TYPECODE_SOFRWARE,
                "Turing machine",
                3200
        );

        System.out.println("book "+ book.toString());
        System.out.println("dvd "+ dvd.toString());
        System.out.println("soft "+ soft.toString());

    }

}
