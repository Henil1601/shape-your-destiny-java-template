package org.example;


public class Rectangle extends Shape implements Polygon {
    protected double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public int numberOfSides() {
        return 4;
    }
}
