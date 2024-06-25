package Problem_7;

public class Table extends Furniture {

    Table(String type, int hoursOfUses) {
        super(type, hoursOfUses);
    }

    @Override
    public double expenditure() {
        return 2.0 * getHoursOfUses();
    }

}
