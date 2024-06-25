package Problem_7;

public class Sofa extends Furniture {

    Sofa(String type, int hoursOfUses) {
        super(type, hoursOfUses);
    }

    @Override
    public double expenditure() {
        return 5.0 * getHoursOfUses();
    }

}
