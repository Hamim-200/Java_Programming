package lab_assignment_two;

public class Main {

    public static void main(String[] args) {
        Washer w = new Washer("My New Washer", 1);
        Oven o = new Oven("RANGS", "20-30");

        w.turnOn();
        w.turnOff();
        o.turnOn();
        o.turnOff();
        
        System.out.println("Washer Name: "+ w.getBrand() + ", Washer Capacity: " + w.getCapacity());
        System.out.println("Oven Name: "+ o.getBrand() + ", Oven Temperature: " + o.getTemperatureRange());

    }
}
