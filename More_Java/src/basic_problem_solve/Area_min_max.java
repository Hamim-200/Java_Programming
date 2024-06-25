package abc;
import java.util.Scanner;

public class Area_min_max {
	public static void main(String []args) {
		
		Scanner index = new Scanner(System.in);
		int A=0, B=0, C=0, MAX=0, MIN=0;
		double Area1=0.0, Area2=0.0;
		
		System.out.println("Enter A : ");
		A= index.nextInt();
		
		System.out.println("Enter B : ");
		B= index.nextInt();
		
		System.out.println("Enter C : ");
		C= index.nextInt();
		
		
		if(A>B && A>C)
			MAX = A;
		
		else if (B>C)
			MAX=B;
		
		else 
			MAX=C;
		
		Area1=3.1416*MAX*MAX;
		
		
		if(A<B && A<C)
			MIN = A;
		
		else if (B<C)
			MIN=B;
		
		else 
			MIN=C;
		
		Area2=3.1416*MIN*MIN;
		
		System.out.println("Max Area is: "+Area1);
		System.out.println("Min Area is: "+Area2);
		
		
		index.close();
	}


}
