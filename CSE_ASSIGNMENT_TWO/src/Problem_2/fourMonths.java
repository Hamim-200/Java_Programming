package Problem_2;

public class fourMonths extends NextSemester {

    private int studentSupport;

    public fourMonths(String name, int year, int studentSupport) {
        super(name, year);
        this.studentSupport = studentSupport;
    }

    public int getStudentSupport() {
        return studentSupport;
    }

    public void setStudentSupport(int studentSupport) {
        this.studentSupport = studentSupport;
    }

    @Override
    public String display() {
        String s = "Student Support For " + this.studentSupport + " Months";
        return s;
    }

    public int calculate() {
        int y = super.getYear() % studentSupport;
        return y;
    }

}
