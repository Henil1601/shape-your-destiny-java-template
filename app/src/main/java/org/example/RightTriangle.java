package org.example;


public class RightTriangle extends Shape implements Polygon {
    protected double legA, legB;

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
    }

    public double getArea() {
        return 0.5 * legA * legB;
    }

    public double getPerimeter() {
        return legA + legB + Math.sqrt(legA * legA + legB * legB);
    }

    public int numberOfSides() {
        return 3;
    }
}
