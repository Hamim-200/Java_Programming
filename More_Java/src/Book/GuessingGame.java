package Book;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[]args ) 
	{
		
		int number =15;
		Scanner input = new Scanner (System.in);
		
		int guess;
		
		do{
			
			System.out.print("Guess the Number:");
			guess = input.nextInt();
			
			if (guess == number ) 
				{
					System.out.println("CONGRATULATION! "+"you gused the number.");
				}
			
			else if (number>guess)
				{
					System.out.println("The number is greater then "+guess);	
				}
			else
				{
					System.out.println("The number is less then "+guess);	
				}
			
		
		}
		while (guess!= number);
	
	}

}
