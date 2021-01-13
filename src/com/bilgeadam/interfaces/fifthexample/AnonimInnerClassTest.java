package com.bilgeadam.interfaces.fifthexample;

public class AnonimInnerClassTest {

    public static void main(String[] args) {
        double width = 2.0;
        double heigth = 4.0;
        IGeometricObject geometricObject = new IGeometricObject() {
            @Override
            public double getArea() {
                return width  * heigth;
            }
            @Override
            public double getPerimeter() {
                return 2 * (width + heigth);
            }
        };
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());
    }
}
