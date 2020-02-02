package com.company;

public class ShapeMain2 {
    public static void main(String args[]){
        Shape2 shapeLine = new Shape2(Shape2.TYPECODE_LINE,0,0,100,100);
        Shape2 shapeRect = new Shape2(Shape2.TYPECODE_RECTANGLE,10,20,30,40);
        Shape2 shapeOval = new Shape2(Shape2.TYPECODE_OVAL,100,200,300,400);

        Shape2[] shapeList = {shapeLine,shapeRect,shapeOval};
        for(Shape2 s:shapeList){
            s.draw();
        }
    }
 }
