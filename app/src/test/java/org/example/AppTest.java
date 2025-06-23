package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testCircle() {
        Circle c = new Circle(5);
        assertEquals(Math.PI * 25, c.getArea(), 0.01);
        assertEquals(2 * Math.PI * 5, c.getPerimeter(), 0.01);
    }

    @Test
    void testRectangle() {
        Rectangle r = new Rectangle(4, 6);
        assertEquals(24, r.getArea());
        assertEquals(20, r.getPerimeter());
    }

    @Test
    void testRightTriangle() {
        RightTriangle rt = new RightTriangle(3, 4);
        assertEquals(6, rt.getArea());
        assertEquals(12, rt.getPerimeter(), 0.01);
    }

    @Test
    void testSquare() {
        Square s = new Square(4);
        assertEquals(16, s.getArea());
        assertEquals(16, s.getPerimeter());
    }

    @Test
    void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle iso = new IsoscelesRightTriangle(5);
        assertEquals(12.5, iso.getArea());
        assertEquals(5 + 5 + Math.sqrt(50), iso.getPerimeter(), 0.01);
    }
}
