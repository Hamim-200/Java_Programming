package oop_yt;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("ABC", "Male", 201983);
        Teacher t2 = new Teacher("DEF", "Female", 89382);
        Teacher t3 = new Teacher();

//        t1.name = "ABC";
//        t1.gender = "Male";
//        t1.phone =  1232023230;
//        t1.setInformation("ABC", "Male", 201983);
        t1.displayInformation();

//        t2.name = "DEf";
//        t2.gender = "TMale";
//        t2.phone =  98323230;
//        t2.setInformation("DEF", "Female", 89382);
        t2.displayInformation();
        
        
        t3.displayInformation();

    }

}
