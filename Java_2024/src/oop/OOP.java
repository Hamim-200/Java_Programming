/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author Hamim_Ahmed
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5, "Blue");
        System.out.println("Radius: " + c1.getRadius() + " Color : " + c1.getColor() + " Area: " + c1.getArea());
        System.out.println("Radius: " + c2.getRadius() + " Color : " + c2.getColor() + " Area: " + c2.getArea());
        
        c1.setRadius(10);
        System.out.println("Radius: " + c1.getRadius() + " Color : " + c1.getColor() + " Area: " + c1.getArea());
    }

}
