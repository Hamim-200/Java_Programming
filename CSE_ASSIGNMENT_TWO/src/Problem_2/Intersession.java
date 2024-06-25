package Problem_2;

public class Intersession extends NextSemester {

    public Intersession(String name, int year) {
        super(name, year);
    }

    @Override
    public String display() {
        return "Semester: " + super.getName() + " " + super.getYear();
    }

    public int calculate() {
        int z = super.getYear() % 2;
        return z;
    }

    public void project(boolean a) {
        if (a == true) {
            System.out.println("Has a project");
        } else {
            System.out.println("Has no project");
        }
    }

}
