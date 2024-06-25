package Overloading_constractor;

public class test {
	public static void main(String []args) {
		
		teacher teacher1 = new teacher();
		teacher teacher2 = new teacher("Hamim","Male");
		teacher2.displayInformation();
		
		teacher teacher3= new teacher("Ahmed","Male",98765);
		teacher3.displayInformation();
	}

}
