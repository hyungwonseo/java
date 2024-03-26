package Java0326Example1;

public class Circle implements Shape {
    private double radius;
    private final double PI = 3.14159265358979;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }
}
