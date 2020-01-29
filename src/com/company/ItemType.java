package com.company;

public class ItemType {
    //int 형이 아닌 ItemType 형
    public static  final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private final int typecode;

    //ItemType이 instance를 외부에서 생성하는 일이 없으므로 생성자를 private로 한다
    //즉 ItemType instance는 BOOK, DVD, SOFTWARE말고 없다는 뜻이다.
    private ItemType(int typecode) {
        this.typecode = typecode;
    }
    public int getTypecode(){ return typecode; }

}
