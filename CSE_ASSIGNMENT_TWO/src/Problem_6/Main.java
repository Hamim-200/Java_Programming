package Problem_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        try {

            System.out.print("Enter the width of rectangle: ");
            double width = S.nextDouble();

            System.out.print("Enter the height of rectangle: ");
            double height = S.nextDouble();

            GeometricObject rectangle = new Rectangle(width, height);

            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();

        }

    }
}
