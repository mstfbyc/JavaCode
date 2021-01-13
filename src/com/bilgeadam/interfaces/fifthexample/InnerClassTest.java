package com.bilgeadam.interfaces.fifthexample;

public class InnerClassTest {
    public static void main(String[] args) {
        Mathematic.Circle circle = new Mathematic().new Circle(1);
        System.out.println(circle.getArea());

        StaticInnerMathematic.Rectangle rectangle = new StaticInnerMathematic.Rectangle(2,4) ;
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

    }
}
