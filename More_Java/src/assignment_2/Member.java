package assignment_2;

public class Member {
	private String name ,address,phonenNumber;
	private int age;
	private double salary;
	

 public Member (String name,String address, String phoneNumber, int age, double salary ) {
	this.name =name;
	this.address = address;
	this.phonenNumber = phoneNumber;
	this.age=age;
	this.salary = salary;
}
 public void printSalary() {
	 System.out.println("Salary = "+salary);
 }
 
 void information() {
	 System.out.println("Name = "+name);
	 System.out.println("Address = "+address);
	 System.out.println("Phone Number = "+phonenNumber);
	 System.out.println("Age = "+age);
	 
	 
 }
 
}