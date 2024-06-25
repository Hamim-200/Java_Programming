package Youtube_practice;
import java.util.Scanner;

public class sum_of_diagonal_lower_upper_triangular {
	
	public static void main(String []args) {

		Scanner input = new Scanner (System.in);
		int[][] A = new int[3][3];
		int sumOfDiagonalElements = 0;
		int sumOfUpperlElements = 0;
		int sumOfLowerElements = 0;
		
		//Matrix input
		for (int row= 3;row<3;row++) {
			for (int col = 0;col<3;col++) {
				A [row] [col] = input.nextInt();
			}
		}
		
		//diagonal,upper,lower 
		for (int row= 3;row<3;row++) {
			for (int col = 0;col<3;col++) {
				
				if (row == col)
				{
					sumOfDiagonalElements = sumOfDiagonalElements + A[row] [col];
				
				}
				
				if (row<col)
				{
					sumOfUpperlElements = sumOfUpperlElements + A[row] [col];
				}
				
				if (row>col)
				{
					sumOfLowerElements = sumOfLowerElements + A[row] [col];
				}
		}
			
			
			System.out.println("Sum of diagonal elements : "+sumOfDiagonalElements);
			System.out.println("Sum of Upper traingular elements : "+sumOfUpperlElements);
			System.out.println("Sum of Lower elements : "+sumOfLowerElements);
		
		
		
		}	
	}

}
