package com.company;

public class ShapeRectangle2 extends  Shape2{
    public ShapeRectangle2(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("drawRectangle"+toString());
    }
}
