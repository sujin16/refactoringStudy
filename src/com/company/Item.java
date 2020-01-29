package com.company;

public class Item {
    public static final  int TYPECODE_BOOK =0;
    public static final  int TYPECODE_DVD =1;
    public static final  int TYPECODE_SOFRWARE =2;

    private final int  typecode;
    private final String title;
    private final int price;

    public Item(int typecode, String title, int price) {
        this.typecode = typecode;
        this.title = title;
        this.price = price;
    }

    public int getTypecode() {
        return typecode;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" +
                + getTypecode() +" , "
                +  getTitle() +" , "
                + getPrice()
                +']';
    }
}