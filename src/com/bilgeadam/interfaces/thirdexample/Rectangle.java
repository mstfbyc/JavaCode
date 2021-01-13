package com.bilgeadam.interfaces.thirdexample;

import java.util.Date;

public class Rectangle implements IGeometricObject {
    private boolean filled;//Ortak
    private String color;//Ortak
    private double width;
    private double heigth;
    private Date dateCreated;//Ortak

    public Rectangle(double width, double hidth) {
        this.width = width;
        this.heigth = hidth;
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
        return dateCreated;
    }

    @Override
    public double getArea() {
        return width  * heigth;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + heigth) ;
    }
}