//PROBLEM-2

package assignment_one;

import java.util.*;

public class Matrix {

    private String name;
    private int year;

    public Matrix() {
        this.name = "No name found";
        this.year = 00 - 00 - 00;
    }

    Matrix(String name, int year) {
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

    public static int[][] calculate(int x, int y) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat1 = new int[x][y];
        int[][] mat2 = new int[x][y];

        System.out.println("Enter the elements of the first Matrix:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second Matrix:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("First Matrix");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication
        int[][] result = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < y; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Multiplication:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        return result;
    }

    public static void main(String[] args) {

        //Default
        Matrix book1 = new Matrix();
        System.out.println(book1.display());

        //USER INPUT
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the book's name: ");
        String book2_name = S.nextLine();

        System.out.print("Enter the year of publication: ");
        int book2_year = S.nextInt();

        Matrix book2 = new Matrix(book2_name, book2_year);
        System.out.println(book2.display());

        // Constructor
        Matrix book3 = new Matrix("Mastery", 1800);
        System.out.println(book3.display());

        //CALCULATE
        System.out.print("Enter the number of rows: ");
        int x = S.nextInt();
        System.out.print("Enter the number of cols: ");
        int y = S.nextInt();
        int[][] result = calculate(x, y);
    }

}
