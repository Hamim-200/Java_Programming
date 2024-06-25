package lab_assignment_two;

public class Oven extends Appliance {

    private String temperatureRange;

    public Oven(String brand, String temperatureRange) {
        super(brand);
        this.temperatureRange = temperatureRange;
    }

    public String getTemperatureRange() {
        return temperatureRange;
    }

    public void setTemperatureRange(String temperatureRange) {
        this.temperatureRange = temperatureRange;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the Oven");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Oven");
    }

}
