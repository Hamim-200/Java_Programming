package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = S.nextInt();
        }

        System.out.println("Enter another integer to check:");
        int numToCheck = S.nextInt();

        
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (array[i] == numToCheck) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        S.close();

    }

}
