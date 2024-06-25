package Assignment;
import java.util.Scanner;

public class Task_3 {
	public static void main (String[]args) {
		Scanner index = new Scanner(System.in);
		
		System.out.print("Enter a :");
		int a = index.nextInt();
		
		System.out.print("Enter b :");
		int b = index.nextInt();
		
		double power = Math.pow(a, b);
		System.out.println("a to the power of b = "+power);
		index.close();
	}
	
	
}
