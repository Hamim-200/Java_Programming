/**
 * The user provides an integer N, then prints the calculation of alternate add and subtract of the
 * Fibonacci series up to that Nth term. It should be done using recursion. The program will only end if 0 or
 * 1 is given as input.
 * */
package assignment_one;

import java.util.*;

public class four {

    public static int fibo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = S.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("END");
        } else {
            int sum = 0;
             System.out.print("Sum: 0 ");  
            for (int i = 1; i < n; i++) {
                int num = fibo(i);
                if (i % 2 == 0) {
                    sum = sum - num;
                    System.out.print(" " + -fibo(i));
                } else {
                    sum = sum + num;
                    System.out.print("+" + fibo(i) + " ");

                }
            }

            System.out.println("\nSUM = " + sum);
        }

    }
}
