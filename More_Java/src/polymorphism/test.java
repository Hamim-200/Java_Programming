package polymorphism;

public class test {
	
	public static void main (String []args) {
		person p = new person();
		p.display();
		
		p = new teacher();
		p.display();
		
		p = new Student();
		p.display();
		
	}
	
	

}
