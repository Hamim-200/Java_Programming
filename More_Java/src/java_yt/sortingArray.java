package Youtube_practice;
import java.util.Arrays;

public class sortingArray {
	public static void main(String []args) {
		int [] number = {10,-20,30,321,342,4223};
		
		Arrays.sort(number);
		
		System.out.println("Ascending : ");
		for (int i=0;i<6;i++) {
			System.out.print(" "+number[i]);
		}
		
		System.out.println();
		System.out.println("Descending : ");
		for (int i = 5; i>=0 ; i--) {
			System.out.print(" "+number[i]);
		}
		
	}

}
