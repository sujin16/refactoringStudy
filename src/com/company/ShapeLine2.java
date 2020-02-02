package com.company;

public class ShapeLine2 extends Shape2 {

    public ShapeLine2(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "line";
    }

    @Override
    public void draw() {
        drawLine();
    }
    public void drawLine(){
        System.out.println("drawLine"+toString());
    }
}

