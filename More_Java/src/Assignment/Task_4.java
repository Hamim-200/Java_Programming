package Assignment;
import java.util.Scanner;

public class Task_4 {
	public static void main(String[]args) {
		Scanner index = new Scanner(System.in);
		double sum = 0;
		
		System.out.println("Enter Number:");
		int n = index.nextInt();
		
		for (int i=1; i<=n; i++) {
			sum=sum +(1/Math.pow(3,i));
		}
		System.out.println(sum);
		index.close();
		
	}
	

}
