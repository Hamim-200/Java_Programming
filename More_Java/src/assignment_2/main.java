package assignment_2;

public class main {
	public static void main (String []args) {
		
		Employee employee = new Employee("Habib","Mirpur","01712345678",30,50000.00,"Web Development");
		
		Manager manager = new Manager ("Rahim","Gazipur","01890987655",28,45000.00,"Communication Department");
		
		
		employee.information();
		employee.information1();
		employee.printSalary();
		
		System.out.println("\n");
		
		manager.information();
		manager.information2();
		manager.printSalary();
		
	}
	

}
