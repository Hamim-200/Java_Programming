package abc;
import java.util.Scanner;

public class break_continue {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int a=0,i=0;
		
		for(i=0;i<10;i++) {
			System.out.println("Input Number:");
			a = in.nextInt();
			
			if (a>50)
				break;
			
			if(a%2!=0)
				continue;
			
			if(a%2==0)
				System.out.println("Even!");
		}
		
		System.out.println("Loop has ended");

	in.close();
		
	}
	

}
