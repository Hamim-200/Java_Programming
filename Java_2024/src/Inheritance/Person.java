package Inheritance;

public class Person {

    private String name;
    private int age;
    private int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    void display() {
        System.out.println("Name " + getName());
        System.out.println("Age " + getAge());
        System.out.println("Phone " + getPhone());
    }

}
