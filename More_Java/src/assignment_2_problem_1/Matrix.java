package assignment_2_problem_1;
import java.util.Scanner;

public class Matrix {
	Scanner index = new Scanner(System.in);
	private int numberOfRows;
	private int numberOfColumns;
	int count = 0;
	
	public Matrix (int numberOfRows ,int numberOfColumns ) {
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
	}
	int array [][] = new int[this.numberOfRows][this.numberOfColumns];
	
	public int getNumberofRows() {
		return numberOfRows;
	}
	
	public int getNumbersOfColumns() {
		return numberOfColumns;
	}
	
	public void set_Elements(int [][]arr,int x,int i,int j) {
		array [i][j]=x;
	}
	
	public void add(int[][] arr,int x,int y,int[][] arr1,int a,int b){
        if(x==a&&y==b){
            System.out.println(" Sum of the two matrice ");
            System.out.println("");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(" "+(arr[i][j]+arr1[i][j]));
                }
                System.out.println("");
            }
           
        }
         else 
            System.out.println("Matrices cannot be added");
        
    }
    int sum=0;
    
    public void multiply(int[][] ar,int x,int y,int[][] ar1,int a,int b){
        if(y==a){
            System.out.println("Multiplication of two matrice");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < b; j++) {
                    for (int k = 0; k < a; k++) {
                       sum=sum+(ar[i][k]*ar1[k][j]);
                    }
                    System.out.print("  "+sum);
                sum=0;
                }
                 System.out.println("");
               
            }
        }
        else
            System.out.println("Multiplication is not Possible");
    }
}



