package abc;
import java.util.Scanner;

public class four_number_max_min_laavg {
	public static void main(String []args) {
		int a,b,c,d,max,min;
		double sum,avg;
	Scanner s = new Scanner (System.in);
	
	a = s.nextInt();
	b = s.nextInt();
	c = s.nextInt();
	d = s.nextInt();
	
	sum = a+b+c+d;
	avg = sum/4;
	
	if (a>b && a>c && a>d)
		max = a;
	else if (b>c && b>d)
		max = b;
	else if(c>d)
		max = c;
	else 
		max = d;
	
	if (a<b && a<c && a<d)
		min = a;
	else if (b<c && b<d)
		min = b;
	else if(c<d)
		min = c;
	else 
		min = d;
	
	
	System.out.println("Average = "+avg);
	System.out.println("Maximum = "+max);
	System.out.println("Minimum = "+min);
	
	s.close();
	
	}
	
	

}
