package oop_yt;
public class Cars1 {

    public String name;
    public int regID;
    public String color;
    public int engCap;
    public final int isitfromBD = 1;

    Cars1(String name, int regID, String color, int engCap) {
        this.name = name;
        this.regID = regID;
        this.color = color;
        this.engCap = engCap;
    }

    public void IsCarOn(boolean a) {
        if (a == true) {
            System.out.println("Car is on");
        } else {
            System.out.println("Car is off");
        }
    }

    public void isCarRegistered() {
        if (regID > 0) {
            System.out.println("Car is registered");
        } else {
            System.out.println("Car is not registered");
        }
    }

    void printInformation() {
        System.out.println("Name = " + name);
        System.out.println("Color = " + color);
        System.out.println("RegID =" + regID);
        System.out.println("Engine Cap = " + engCap);
        
    }

    public static void main(String[] args) {
        Cars1 a = new Cars1("Premio", 123, "Black", 1800);
        a.printInformation();
        a.IsCarOn(true);
        a.isCarRegistered();
        System.out.println("");

        Cars1 b = new Cars1("Corolla", 456, "Pink", 180);
        b.printInformation();
        b.IsCarOn(false);
        b.isCarRegistered();

    }

}
