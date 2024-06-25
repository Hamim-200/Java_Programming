package staticKeyword;

public class Student {

    String name;
    int id;
    static String universityName = "LU";
    
    static int count = 0;

    Student(String n, int i) {
        this.name = n;
        id = i;
        count++;
    }
    
    
    void displayInformation(){
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("University Name :"+universityName);
    }
    
    void totalStudent(){
        System.out.println("Total Student: "+count);
    }
}
