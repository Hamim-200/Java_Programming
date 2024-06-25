package abc;
import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[]args) {
		Scanner index = new Scanner (System.in);
		
		int sum=0,r,temp,num;
		System.out.println("Enter any number :");
		num = index.nextInt();
		temp = num;
		
		while(temp!=0) {
			
			r=temp%10;
			sum = sum+ r*r*r;
			temp = temp/10;
		}
		if(num==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		index.close();
		
	}

}
