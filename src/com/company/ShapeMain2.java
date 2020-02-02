package com.company;

public class ShapeMain2 {
    public static void main(String args[]){
        Shape2 shapeLine = Shape2.createLine(0,0,10,10);
        Shape2 shapeRect = Shape2.createRectangle(10,20,30,40);
        Shape2 shapeOval = Shape2.createOval(100,200,300,400);

        Shape2[] shapeList = {shapeLine,shapeRect,shapeOval};
        for(Shape2 s:shapeList){
            s.draw();
        }
    }
 }
