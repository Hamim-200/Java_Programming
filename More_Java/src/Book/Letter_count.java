package Book;

import java.util.Scanner;

public class Letter_count {
	public static void main (String []args ) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter characters : ");
		
		String inputValue = input.nextLine();
	
		inputValue = inputValue.toLowerCase();
		char [] letters = inputValue.toCharArray();
		
		int [] counts = new int [26];
		
		for (int i = 0; i<letters.length; i++ ) {
			char letter = letters [i];
			if (Character.isLetter(letter)) {
				int index = letter - 'a';
				counts [index]++;
			}
		}
		
		System.out.println("Letter counts :");
		for (int i = 0; i<counts.length; i++) {
			if(counts[i] != 0) {
				char letter = (char) (i+'a');
				System.out.println(letter + ": " + counts[i]);
				
			}
			
			
		}
		
		
		
	}

}
