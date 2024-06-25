package oop;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1;
        color = "Red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r){
        radius = r;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 3.1416 * radius * radius;
    }

}
