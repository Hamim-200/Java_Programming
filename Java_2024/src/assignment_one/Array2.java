/**
 * 7) Similar to the instruction of Question 6, create a class ”Array 2” but here the 2D array size (N) should
 * be provided by the user and the sum result will be printed like before. For example: if N = 4, then the
 * array will be a 4 x 4 (2D) array.
 * */
package assignment_one;

import java.util.*;

public class Array2 {

    private int[][] arr;
    private int size;

    Array2(int sz) {
        this.size = sz;
        this.arr = new int[sz][sz];
    }

    public void setArray(int[][] arr) {
        this.arr = arr;
    }

    public int[][] getArray() {
        return arr;
    }

    public void arrayInput() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = S.nextInt();
            }
        }
    }

    public void arrayPrint() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public int summation() {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < size - 1; i++) {
            if (size % 2 == 0) {
                sum1 = sum1 + arr[i][size / 2]; //2 
            } else {
                sum1 = sum1 + arr[i][(size - 1) / 2];
            }
        }
        for (int j = 0; j < size; j++) {
            sum2 = sum2 + arr[size - 1][j];
        }
        return sum1 + sum2;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sz = S.nextInt();

        Array2 arr1 = new Array2(sz);
        arr1.arrayInput();
        arr1.arrayPrint();
        System.out.println("Sum of Arr1: " + arr1.summation());

        Array2 arr2 = new Array2(sz);
        arr2.arrayInput();
        arr2.arrayPrint();
        System.out.println("Sum of Arr1: " + arr2.summation());
        
        Array2 arr3 = new Array2(sz);
        arr3.arrayInput();
        arr3.arrayPrint();
        System.out.println("Sum of Arr1: " + arr3.summation());
    }

}
