package com.bilgeadam.interfaces.thirdexample;

public class TestGeometric {
    public static void main(String[] args) {
        IGeometricObject geometricObject = new Circle(3);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());

        IGeometricObject geometricObject1 = new Rectangle(2,4);
        System.out.println(geometricObject1.getPerimeter());
        System.out.println(geometricObject1.getArea());

    }
}
