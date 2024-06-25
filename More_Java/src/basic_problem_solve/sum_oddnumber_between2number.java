package abc;
import java.util.*;

public class sum_oddnumber_between2number {
	
	
		    public static void main (String[]args) {
				Scanner index = new Scanner(System.in);
				int sum = 0;
				
				
				System.out.println("Enter First Number :");
				int a = index.nextInt();
				
				System.out.println("Enter Second Number :");
				int b = index.nextInt();
				
				while(a <= b) {
					if(a%2 !=0)
					{
						sum = sum + a;
					}
					a++;
					
				}
				System.out.println("Sum is:"+sum);
				
				
	}
	}


