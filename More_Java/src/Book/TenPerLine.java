package Book;

public class TenPerLine {
	public static void main(String []args) {
		int Start =1;
		int End=500;
		int per_line = 10;
		
		int counter =Start;
		
		while (counter <=End) {
			System.out.print(counter + " ");
			
			if ((counter + 1)% per_line==0) {
				
				System.out.println();
			}
			counter++;
			
		}
		

	}

}
