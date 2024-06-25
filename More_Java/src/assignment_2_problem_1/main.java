package assignment_2_problem_1;
import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		
		Scanner index = new Scanner(System.in);
		
		System.out.println("Rows for first matrix:");
        int x=index.nextInt();
        
        System.out.println("Column for first matrix:");
        int y=index.nextInt();
        
        System.out.println("Rows for second matrix:");
        int a=index.nextInt();
        
        System.out.println("Column for second matrix");
        int b=index.nextInt();
        
        Matrix m1=new Matrix(x,y);
        
        Matrix m2=new Matrix(a,b);
        
        int arr[][]=new int[x][y];
        for (int i = 0; i<x; i++) {
        	for (int j =0; j<y; j++) {
        		arr [i][j] = index.nextInt();
        		
        	}
        	
        }
        int arr1[][] = new int [a][b];
        for (int i = 0; i<a; i++) {
        	for (int j =0;j<b;j++) {
        		arr1 [i][j] = index.nextInt();
        	}
        	
        }

        m1.add(arr, x, y, arr1, a, b);
        m2.multiply(arr, x, y, arr1, a, b);
	}

}
