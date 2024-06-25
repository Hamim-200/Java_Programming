/*
Ask the user to enter a single integer value(n) and write a Java method “summation” that
returns the sum of every multiple of 3 from 1 up to the provided integer n. If the user inputs 17 then 
the sum of 3 + 6 + 9 + 12 + 15 is 45. 45 will be the output.
 */
package assignment_one;

import java.util.*;

public class three {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter a single integer value : ");
        int n = S.nextInt();
        int result = summation(n);
        System.out.println("Result is:" + result);
    }

    public static int summation(int n) {
        int sum = 0, i = 3;
        while (i <= n) {
            sum = sum + i;
            i = i + 3;
        }
        return sum;
    }

}
