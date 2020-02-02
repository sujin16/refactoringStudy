package com.company;

public class Shape2 {
    public static final int TYPECODE_LINE =0;
    public static final int TYPECODE_RECTANGLE =1;
    public static final int TYPECODE_OVAL =2;

    private final int typecode ,startx,starty,endx,endy;

    public Shape2(int typecode, int startx, int starty, int endx, int endy) {
        this.typecode = typecode;
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }

    public int getTypecode() {
        return typecode;
    }
    public String getName(){
        switch (typecode){
            case TYPECODE_LINE: return "line";
            case TYPECODE_RECTANGLE: return "rectangle";
            case TYPECODE_OVAL: return "oval";
            default: return null;
        }
    }

    @Override
    public String toString() {
        return "(" + startx +
                "," + starty +
                ")  ~ (" + endx +
                ", " + endy +
                ")";
    }

    public void draw(){
        switch (typecode){
            case TYPECODE_LINE:
                drawLine();
                break;
            case TYPECODE_RECTANGLE:
                drawRectangle();
                break;
            case TYPECODE_OVAL:
                drawOval();
                break;
            default: ;
        }
    }
    public void drawLine(){
        System.out.println("drawLine"+this.toString());
    }
    public void drawRectangle(){
        System.out.println("drawRectangle"+this.toString());
    }
    public void drawOval(){
        System.out.println("drawOval"+this.toString());
    }

}
