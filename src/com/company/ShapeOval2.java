package com.company;

public class ShapeOval2 extends Shape2 {
    public ShapeOval2(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "oval";
    }
    @Override
    public void draw() {
        drawOval();
    }
    public void drawOval(){
        System.out.println("drawOval"+toString());
    }
}
