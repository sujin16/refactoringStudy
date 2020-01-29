package com.company;

public class Item {
    private final String title;
    private final int price;
    private final ItemType itemtype;

    public Item(ItemType itemtype,String title, int price) {
        this.itemtype = itemtype;
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public ItemType getItemtype() {
        return itemtype;
    }

    @Override
    public String toString() {
        return "[" +
                + itemtype.getTypecode() +" , "
                +  getTitle() +" , "
                + getPrice()
                +']';
    }
}