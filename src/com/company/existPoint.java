package com.company;

public class existPoint {

    Point[] point;

    public existPoint(Point[] point){
        this.point = point;
    }

    public boolean exitPoint(int x,int y){

        for(int i=0; i<point.length;i++){
            if(point[i].x ==x &&point[i].y ==y ){
             return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Point[] points = {new Point(1,2), new Point(10,2)};
        existPoint exist = new existPoint(points);

        if(exist.exitPoint(1,2)){
            System.out.println("exist point ");
        }else{
            System.out.println("no exist point ");
        }

    }

}

class Point {
    public int x;
    public int y;
    public Point(int x, int y){
        this.x =x;
        this.y =y;
    }
}

