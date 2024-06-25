package Problem_6;

public abstract class GeometricObject {

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract boolean isFilled();

    public abstract void setFilled(boolean filled);

    public abstract java.util.Date getDateCreated();

    @Override
    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();

}
