package lesson7.interfaces;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3.0);

        System.out.println("Circle's area: " + circle.getArea());
        System.out.println("Circle's perimeter: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(2.0, 3.0);

        System.out.println("Rectangle's area: " + rectangle.getArea());
        System.out.println("Rectangle's perimeter: " + rectangle.getPerimeter());

    }
}
