package com.bilgeadam.interfaces.fifthexample;

public class Mathematic {
    //Inner class
    // static ınner class
    // local inner class
    //Anonim inner class ***** Android en çok kullanılan
    private String  color;
    private boolean filled;
    private Circle circle;

    public Mathematic() {
    }

    public Mathematic(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public class Circle{
        private double radius;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColor(){
            return color;
        }


        public double getArea() {
            return java.lang.Math.PI * java.lang.Math.pow(radius,2);
        }


        public double getPerimeter() {
            return 2 * java.lang.Math.PI * radius ;
        }
    }


}

