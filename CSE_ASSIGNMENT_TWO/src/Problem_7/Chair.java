package Problem_7;

public class Chair extends Furniture {

    Chair(String type, int hoursOfUses) {
        super(type, hoursOfUses);
    }

    @Override
    public double expenditure() {
        return 0.5 * getHoursOfUses();
    }

}
