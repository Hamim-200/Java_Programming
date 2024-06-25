package abc;
import java.util.Scanner;

public class prime_number {
	public static void mainb(String[]args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter any positive number: ");
		int num = s.nextInt();
		int count = 0;
		
		for (int i = 2; i< num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if (count == 0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
		s.close();
		
	}

}
