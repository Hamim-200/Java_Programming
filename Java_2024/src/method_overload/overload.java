package method_overload;

public class overload {

    public void display() {
        System.out.println("Display with no parameters");
    }

    public void display(int a) {
        System.out.println("Display with one integer parameter: " + a);
    }

    public void display(double a) {
        System.out.println("Display with one double parameter: " + a);
    }

    public void display(int a, double b) {
        System.out.println("Display with two parameters (int, double): " + a + ", " + b);
    }

    public void display(double a, int b) {
        System.out.println("Display with two parameters (double, int): " + a + ", " + b);
    }

    public static void main(String[] args) {
        overload obj = new overload();

        obj.display();
        obj.display(5);
        obj.display(3.14);
        obj.display(10, 20.5);
        obj.display(7.5, 2);
    }
}
