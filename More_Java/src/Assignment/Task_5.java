package Assignment;
import java.util.Scanner;

public class Task_5 {
	public static void main(String[]args) {
		Scanner index = new Scanner (System.in);
		char c;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Enter 10 character : ");
			c = index.next().charAt(0);
			if (c =='a'|| c=='e'||c =='i'|| c =='o'|| c=='u') {
				System.out.println("Its a vowel");
			}
			else  if (c =='b'||c =='z') {
				System.out.println("critical error!!!");
				break;
				
			}
			
			
		}
		
	}

}
