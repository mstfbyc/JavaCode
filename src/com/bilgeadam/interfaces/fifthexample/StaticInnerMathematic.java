package com.bilgeadam.interfaces.fifthexample;

public class StaticInnerMathematic {
    private String  color;
    private boolean filled;
    private Rectangle rectangle;

    public StaticInnerMathematic() {
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

    public static class Rectangle{
        private double width;
        private double heigth;

        public Rectangle() {
        }

        public Rectangle(double width, double heigth) {
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

        public double getArea() {
            return width  * heigth;
        }
        public double getPerimeter() {
            return 2 * (width + heigth) ;
        }

    }
}

