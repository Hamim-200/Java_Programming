/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Hamim_Ahmed
 */
public class studentMain {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Hamim", 2.5);

        System.out.println("Name: " + s1.getName() + " GPA: " + s1.getGpa());
        System.out.println("Name: " + s2.getName() + " GPA: " + s2.getGpa());
    }

}
