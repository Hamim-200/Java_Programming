package assignment_2;

public class Employee extends Member {
	
	private String specialization;
	
	public Employee (String name,String address, String phoneNumber, int age, double salary,String specialization ) {
		super(name, address, phoneNumber, age, salary);
		this.specialization = specialization;
		
	}
	void information1() {
		
	System.out.println("specialization = "+specialization);
	}

}
