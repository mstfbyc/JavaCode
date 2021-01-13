package com.bilgeadam.interfaces.fourthexample;

public class TestAbstract {
    //Abstract Class ile Class arasındaki
    //Abstract Class ile Interface arasındaki

    public static void main(String[] args) {
        GeometricObject geometricObject = new Rectangle("Red",true,2,4);

        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());
        System.out.println(geometricObject.getColor());

        GeometricObject geometricObject1 = new Cicle("Blue",true,7);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());
        System.out.println(geometricObject1.getColor());
    }
}

