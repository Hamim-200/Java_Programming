package constractor;

public class Teacher {

    String name, gender;
    int phone;

    Teacher() {
        System.out.println("Default Information");

    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }
    
    void displayInformation(){
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phone);
    }

}
