package com.company;

import java.util.concurrent.ArrayBlockingQueue;

public abstract class Shape2 {
    private final int startx,starty,endx,endy;

    protected Shape2(int startx, int starty, int endx, int endy) {
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }

    public static Shape2 createLine(int startx, int starty, int endx, int endy){
        return new ShapeLine2(startx,starty,endx, endy);
    };
    public static Shape2 createRectangle(int startx, int starty, int endx, int endy){
        return new ShapeRectangle2(startx,starty,endx, endy);
    };
    public static Shape2 createOval(int startx, int starty, int endx, int endy){
        return new ShapeOval2(startx,starty,endx, endy);
    };

    public abstract  String getName();

    @Override
    public String toString() {
        return "(" + startx +
                "," + starty +
                ")  ~ (" + endx +
                ", " + endy +
                ")";
    }

    public abstract void draw();

}
