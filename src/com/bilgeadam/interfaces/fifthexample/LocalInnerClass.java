package com.bilgeadam.interfaces.fifthexample;

public class LocalInnerClass {

    public static void main(String[] args) {
        class Area{
            private double radius;
            public Area(double radius){
                this.radius = radius;
            }
            public double getArea(){
                return Math.PI * Math.pow(radius,2);
            }
        }
        Area area1 = new Area(2);
        Area area2 = new Area(3);
        System.out.println(area1.getArea());
        System.out.println(area2.getArea());
    }
    public static void test(){

    }
}

