/**
 * Create a class “Array” which creates a 3 x 3 (2D) array and prints the result of the summation like the
 * following :
 *
 * */
package assignment_one;

public class Array {

    private int[][] arr;

    Array() {
        this.arr = new int[3][3];
    }

    public void setArray(int[][] arr) {
        this.arr = arr;
    }

    public int[][] getArray() {
        return arr;
    }

    public void arrayInput(int[][] num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr = num;
            }
        }
    }

    public void arrayPrint() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public int Summation() {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 2; i++) {
            sum1 = sum1 + arr[i][1];
        }

        for (int j = 0; j < 3; j++) {
            sum2 = sum2 + arr[2][j];
        }
        return sum1 + sum2;

    }

    public static void main(String[] args) {
        Array arr = new Array();
        int[][] num = {
            {1, 3, 4},
            {5, 0, 6},
            {9, 7, 4}
        };
        arr.arrayInput(num);
        arr.arrayPrint();
        int result = arr.Summation();
        System.out.println("Sum is = " + result);
    }

}
