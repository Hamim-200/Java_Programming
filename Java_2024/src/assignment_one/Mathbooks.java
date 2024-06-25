/** *
 * Problem 1
 ** */
package assignment_one;

import java.util.*;

public class Mathbooks {

    private String name;
    private int year;

    public Mathbooks() {
        this.name = "No name found";
        this.year = 00 - 00 - 00;
    }

    public Mathbooks(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String display() {
        return "Name of the Book : " + this.getName() + " , " + "Publishing year : " + this.getYear();
    }

    public static int calculate(int x, int y) {
        Scanner S = new Scanner(System.in);

        if (x != y) {
            System.out.println("Rows and columns must be equal for diagonal sum.");
            return 0;
        }
        int[][] arr = new int[x][y];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = S.nextInt();
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum =sum+ arr[i][i];
        }
        return sum;

    }

    public static void main(String[] args) {

        //Default
        Mathbooks book1 = new Mathbooks();
        System.out.println(book1.display());

        //USER INPUT
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the book's name: ");
        String book2_name = S.nextLine();

        System.out.print("Enter the year of publication: ");
        int book2_year = S.nextInt();

        Mathbooks book2 = new Mathbooks(book2_name, book2_year);
        System.out.println(book2.display());

        // Constructor
        Mathbooks book3 = new Mathbooks("Mastery", 1800);
        System.out.println(book3.display());

        //CALCULATE
        System.out.print("Enter the number of rows: ");
        int x = S.nextInt();
        System.out.print("Enter the number of cols: ");
        int y = S.nextInt();
        int diagonalSum = calculate(x, y);
        System.out.println("Sum of the diagonal: " + diagonalSum);

    }

}
