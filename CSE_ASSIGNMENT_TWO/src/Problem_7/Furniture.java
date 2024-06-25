package Problem_7;

abstract class Furniture {

    private String type;
    private int hoursOfUses;

    Furniture(String type, int hoursOfUses) {
        this.type = type;
        this.hoursOfUses = hoursOfUses;
    }

    public abstract double expenditure();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHoursOfUses() {
        return hoursOfUses;
    }

    public void setHoursOfUses(int hoursOfUses) {
        this.hoursOfUses = hoursOfUses;
    }

}
