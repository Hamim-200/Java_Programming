package Problem_4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the base of Triangle: ");
        double base = s.nextDouble();
        
        System.out.print("Enter the height of Triangle: ");
        double height = s.nextDouble();
        
        System.out.print("Enter the adjacent of Triangle: ");
        double adjacent = s.nextDouble();
        
        Triangle t = new Triangle(base, height, adjacent);
        t.area();
        t.perimeter();

        System.out.print("Enter the radius of Circle: ");
        double radius = s.nextDouble();
        
        Circle c = new Circle(radius);
        c.area();
        c.perimeter();
    }

}
