package java_yt;

import java.util.Scanner;
public class palindrom_num {
    public static void main(String[] args) {
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
		if(num==sum) {
			
			System.out.println("Palindrom Number");
		}
		else {
			System.out.println(" Not Palindrom Number");
		}
		
    }
    
}
