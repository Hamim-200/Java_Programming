package oop;

public class Student {

    private String name;
    private double gpa;

    public Student() {
        name = "No Name Found";
        gpa = 0.00;
    }

    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double g) {
        gpa = g;
    }

}
