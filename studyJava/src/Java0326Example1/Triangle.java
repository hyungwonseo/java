package Java0326Example1;

public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * base * 0.5;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * base;
    }
}
