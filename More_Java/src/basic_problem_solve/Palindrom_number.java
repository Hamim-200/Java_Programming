package abc;
import java.util.Scanner;

public class Palindrom_number {
	public static void main(String[]args) {
		Scanner index = new Scanner(System.in);
		int sum=0,r,temp,num;
		System.out.println("Enter any number :");
		num = index.nextInt();
		temp = num;
		while(temp!=0) {
			r= temp%10;
			sum = sum*10+r;
			temp = temp/10;
			
		}
		if(num==sum) {
			System.out.println("Palindorm Number");
		}
		else {
			System.out.println("Not Palindrom Number");
		}
		index.close();
	}

}
