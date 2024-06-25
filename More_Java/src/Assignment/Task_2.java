package Assignment;

import java.util.Scanner;

public class Task_2 {
	public static void main (String[]args) {
		Scanner index = new Scanner(System.in);
		
		
		System.out.println("Enter First Number :");
		int num1 = index.nextInt();
		
		System.out.println("Enter Second Number :");
		int num2 = index.nextInt();
		
		System.out.println("Odd Numbers are :");
		
		while(num1 <= num2) {
			if(num1%2 !=0)
			{
				System.out.println(num1);
			}
			num1++;
			index.close();
			
		}			

	}
	}
