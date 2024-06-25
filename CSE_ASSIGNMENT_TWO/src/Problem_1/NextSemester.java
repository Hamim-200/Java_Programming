package Problem_1;

public class NextSemester {

    private String name;
    private int year;

    public NextSemester() {
        this.name = "Null";
        this.year = 0;
    }

    public NextSemester(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String display() {
        return "Semester was : " + this.name + " " + this.year;
    }

    public int calculate(int year) {
        int sum = 0;
        while (year != 0) {
            sum = sum + year % 10;
            year = year / 10;
        }
        return sum;
    }

}
