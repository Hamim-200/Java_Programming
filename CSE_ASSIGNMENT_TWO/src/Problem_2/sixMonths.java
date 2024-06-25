package Problem_2;

public class sixMonths extends NextSemester {

    private int studentSupport;

    public sixMonths(String name, int year, int studentSupport) {
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
        String s = "Student Support For " + studentSupport + " Months";
        return s;
    }

    public int calculate() {
        int y = super.getYear() % studentSupport;
        return y;
    }

}

