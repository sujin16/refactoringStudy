package com.company;

public class ItemMain {
    public static void main(String args[]){
        Item book = new Item(
                ItemType.BOOK,
                "world histoty",
                4800
        );
        Item dvd = new Item(
                ItemType.DVD,
                "dream of newYork",
                3000
        );
        Item soft = new Item(
                ItemType.SOFTWARE,
                "Turing machine",
                3200
        );

        System.out.println("book "+ book.toString());
        System.out.println("dvd "+ dvd.toString());
        System.out.println("soft "+ soft.toString());

    }

}
