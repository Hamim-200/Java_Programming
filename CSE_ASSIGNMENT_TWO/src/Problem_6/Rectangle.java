package Problem_6;

import java.util.Date;

public class Rectangle extends GeometricObject implements ExceptionInterface {

    private double width;
    private double height;
    private String color;
    private boolean filled;
    private Date dateCreated;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width can not be negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height can not be negative.");
        }
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
