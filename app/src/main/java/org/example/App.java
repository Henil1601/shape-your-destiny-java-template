package org.example;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new RightTriangle(3, 4);
        Shape square = new Square(4);
        Shape isoTriangle = new IsoscelesRightTriangle(5);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Isosceles Triangle Area: " + isoTriangle.getArea());
    }
}
