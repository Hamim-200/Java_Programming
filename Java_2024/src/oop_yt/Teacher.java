package oop_yt;

public class Teacher {
    String name,gender;
    int phone;
    
    Teacher(String S,String G,int num){
        name = S;
        gender = G;
        phone = num;
    }
    Teacher(){
        System.out.println("Type your Name!");
        System.out.println("Type your Gender!");
        System.out.println("Type your Number!");
    }
    
    
//    void setInformation(String S,String G,int num){
//        name = S;
//        gender = G;
//        phone =  num;
//        
//    }
    
//    for PRINT information
    void displayInformation(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+gender);
        System.out.println("Phonee: "+phone);
        System.out.println("");
    }
    
    
}
