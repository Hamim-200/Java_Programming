package Assignment;

public class Task_6 {
	public static void main(String []args) {
		
		System.out.println("Armstrong numbers between 1 and 999: ");
		
		int x , a, sum=0;
		
		for (int i = 1; i<=999; i++) {
			x = i;
			while(x > 0) {
				
				a = x % 10;
				sum = sum + (a * a * a);
				x = x / 10;
				
			}
			if (sum == i) {
				System.out.println(i);
			}
			sum=0;
		}
	}

}
