package lab_assignment_two;

public class Washer extends Appliance {

    private double capacity;

    public Washer(String brand, double capacity) {
        super(brand);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the Washer");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Washer");
    }

}
