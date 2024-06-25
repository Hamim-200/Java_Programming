package assignment_2;

public class Manager extends Member{
	
private String department;
	
	public Manager (String name,String address, String phoneNumber, int age, double salary,String department ) {
		super(name, address, phoneNumber, age, salary);
		this.department= department;
		
	}
	void information2() {
		
		System.out.println("Department = "+department);
		}

}
