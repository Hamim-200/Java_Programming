package assignment_three;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {
        int[] a = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println("Array:");
        for (int i = 0; i < 100; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        try {
            int valueAtIndex = a[index];
            System.out.println(index + " Index Value is : " + valueAtIndex);

            System.out.print("the number divide by the value: ");
            int div = scanner.nextInt();
            try {
                int result = valueAtIndex / div;
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
                writeExceptionToFile(e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
            writeExceptionToFile(e);
        }

        System.out.println("Program ends");
    }

    private static void writeExceptionToFile(Exception e) {
        try {
            FileOutputStream fos = new FileOutputStream("exceptions.txt", true);
            PrintWriter pw = new PrintWriter(fos);
            pw.println("Caught exception: " + e.toString());
            pw.close();
            fos.close();
        } catch (IOException ioException) {
            System.out.println("Error writing to file");
        }
    }
}
