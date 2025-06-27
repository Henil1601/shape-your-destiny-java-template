public class Parallelogram extends Shape implements Polygon {
    private double base, height, side;

    public Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return 2 * (base + side);
    }

    public int numberOfSides() {
        return 4;
    }
}
