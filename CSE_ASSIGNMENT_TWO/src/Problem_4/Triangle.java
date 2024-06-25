package Problem_4;

public class Triangle implements GeoObj {

    private double base;
    private double height;
    private double adjacent;

    Triangle(double base, double height, double adjacent) {
        this.adjacent = adjacent;
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(double adjacent) {
        this.adjacent = adjacent;
    }

    @Override
    public void area() {
        double triangle_area = 0.5 * this.base * this.height;
        System.out.println("Triangle Area: " + triangle_area);
    }

    @Override
    public void perimeter() {
        double triangle_perimeter = this.base + this.height + this.adjacent;
        System.out.println("Triangle Perimeter: " + triangle_perimeter);

    }

}
