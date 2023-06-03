package lesson7.interfaces;

public class Circle implements Shape{

    private double radius;

    @Override
    public double getArea() {
        return Shape.P * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Shape.P * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
