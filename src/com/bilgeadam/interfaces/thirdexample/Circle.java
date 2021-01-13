package com.bilgeadam.interfaces.thirdexample;

import java.util.Date;

public class Circle implements IGeometricObject {

    private boolean filled;
    private String color;
    private double radius;
    private Date dateCreated;


    public Circle(double radius) {
        this.radius = radius;
        dateCreated = new Date();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setfilled(boolean filled) {
        this.filled = filled;

    }

    @Override
    public boolean getfilled() {
        return filled;
    }

    @Override
    public Date getDateCreated() {
        return getDateCreated();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius ;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
