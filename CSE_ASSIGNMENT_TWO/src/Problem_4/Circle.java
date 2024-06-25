package Problem_4;

public class Circle implements GeoObj {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double circle_area = 3.14 * this.radius * this.radius;
        System.out.println("Circle Area: " + circle_area);
    }

    @Override
    public void perimeter() {
        double circle_perimeter = 2 * 3.14 * this.radius;
        System.out.println("Circle Perimeter: " + circle_perimeter);
    }
}
