package oop_yt;

import java.util.*;

public class factorial {

   public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = s.nextInt();
        int result = fact(value);
        System.out.println("Factorial of " + value + " is = "+result);
        
    }

}
