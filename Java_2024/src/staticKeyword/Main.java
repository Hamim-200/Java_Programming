/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticKeyword;

/**
 *
 * @author Hamim_Ahmed
 */
public class Main {

    public static void main(String[] args) {
        Student S1 = new Student("Hamim", 121);
        S1.displayInformation();

        Student S2 = new Student("Ramim", 121);
        S2.displayInformation();

        Student S3 = new Student("Tamim", 121);
        S3.displayInformation();

        S1.totalStudent();
    }

}
