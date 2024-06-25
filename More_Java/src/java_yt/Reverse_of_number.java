package Youtube_practice;
import java.util.Scanner;

import java.util.Scanner;

public class Reverse_of_number {
	
public static void main (String[]args) {
		
		Scanner I = new Scanner (System.in);
		int sum=0,r,temp,num;
		System.out.println("Enter any number :");
		num = I .nextInt();
		
		temp = num;
		
		while(temp!=0) {
			
			r=temp %10;
			sum = sum * 10 +r;
			temp = temp /10;
		}
		System.out.println("Sum of digits : "+sum);
		
		
	}

}
