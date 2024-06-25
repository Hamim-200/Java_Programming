package lab_assignment_two;

public abstract class Appliance {

    private String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public abstract void turnOn();

    public abstract void turnOff();
}
