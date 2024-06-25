package Youtube_practice;

import java.util.Scanner;

public class array_Matrix {
	public static void main (String []args) {
		
		Scanner input = new Scanner (System.in);
		int [][] A = new int [2][3];
		int [][] B = new int [2][3];
		
		System.out.println("Enter elements for A matrix");
		//getting input for A matrix 
		for(int row = 0; row < 2; row++)
		{
			for (int col = 0; col < 3; col++) 
			{
				System.out.printf("A [%d][%d] = ",row,col);
				A[row][col] = input.nextInt(); 
			}
		}
		//getting input for B matrix
		System.out.println("Enter elements for B matrix"); 
		for(int row = 0; row < 2; row++)
		{
			for (int col = 0; col < 3; col++) 
			{
				System.out.printf("B [%d][%d] = ",row,col);
				B[row][col] = input.nextInt(); 
			}
		}
		
		//Printing A matrix 
		System.out.print("A = ");
		for(int row = 0; row < 2; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				System.out.print("\t"+A[row][col]);
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		//Printing B matrix 
		System.out.print("B = ");
		for(int row = 0; row <2; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				System.out.print("\t"+B[row][col]);
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n");
		//adding A & B matrix
		System.out.print("A+B = ");
		for(int row = 0; row <2; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				System.out.print("\t"+(A[row][col] + B[row][col]));
			}
			System.out.println();
		}
		
		
		
		
	}
}
