package com.bilgeadam.interfaces.fourthexample;

public class Rectangle extends GeometricObject {
    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return heigth * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (heigth + width);
    }
}
