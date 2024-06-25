/*
The lengths of the adjacent/opposite sides of a right triangle should be taken from the user, and 
suppose that the lengths of these two sides (adjacent & opposite) are equal.You must display a right 
facing triangle with the character * filled in according to the lengths of its adjacent and opposite line
 */
package assignment_one;

import java.util.*;

public class five {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int n = S.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
