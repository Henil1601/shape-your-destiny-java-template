package org.example;


public class ShapeTest {
    public static void main(String[] args) {
        // Circle
        Shape circle = new Circle(5);
        System.out.printf("Circle → Area: %.2f, Perimeter: %.2f\n", circle.getArea(), circle.getPerimeter());

        // Rectangle
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.printf("Rectangle → Area: %.2f, Perimeter: %.2f, Sides: %d\n",
                rectangle.getArea(), rectangle.getPerimeter(), rectangle.numberOfSides());

        // Square
        Square square = new Square(4);
        System.out.printf("Square → Area: %.2f, Perimeter: %.2f, Sides: %d\n",
                square.getArea(), square.getPerimeter(), square.numberOfSides());

        // Right Triangle
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        System.out.printf("RightTriangle → Area: %.2f, Perimeter: %.2f, Sides: %d\n",
                rightTriangle.getArea(), rightTriangle.getPerimeter(), rightTriangle.numberOfSides());

        // Isosceles Right Triangle
        IsoscelesRightTriangle isoRight = new IsoscelesRightTriangle(3);
        System.out.printf("IsoscelesRightTriangle → Area: %.2f, Perimeter: %.2f, Sides: %d\n",
                isoRight.getArea(), isoRight.getPerimeter(), isoRight.numberOfSides());

        // Parallelogram (Add-On)
        Parallelogram parallelogram = new Parallelogram(5, 3, 4);
        System.out.printf("Parallelogram → Area: %.2f, Perimeter: %.2f, Sides: %d\n",
                parallelogram.getArea(), parallelogram.getPerimeter(), parallelogram.numberOfSides());
    }
}
