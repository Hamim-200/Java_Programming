package abc;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        
        int i=0;
        char c ;
        
        for(i=0;i<10;i++) {
        	System.out.println("Input grade:");
        	c = index.next().charAt(0);
        	
        	if(c=='a'||c=='b')
        		System.out.println("Congratulation");
        	
        	if (c>='c') {
        		System.out.println("Sorry");
        	}
        }
        System.out.println("Loop has ended!");
        
        index.close();
	}
}
