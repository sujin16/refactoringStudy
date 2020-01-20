package com.company;

public class existPoint {
    Point[] point;
    public existPoint(Point[] point){
        this.point = point;
    }

    public boolean exitPoint(int x,int y){
        boolean f = false;
        boolean ff= false;
        for(int i=0; !(f&&ff)&&i<point.length;i++){
            if(point[i].x == x){
                f =true;
            }else{
                f = false;
            }
            if(point[i].y ==y){
                ff =true;
            }else{
                ff =false;
            }
        }
        boolean fff  =false;
        if(f&&ff){
            fff =true;
        }else{
            fff =false;
        }
        return fff;
    }
    public static void main(String args[]){
        Point[] points = {new Point(1,2), new Point(10,2)};
        existPoint exist = new existPoint(points);

        if(exist.exitPoint(1,20)){
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

