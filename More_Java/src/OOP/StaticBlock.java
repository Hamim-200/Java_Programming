package OOP;

public class StaticBlock {
	
	static int id;
	static String name;
	
	static {
		id = 101;
		name = "Hamim";
	}
	
	static void display() {
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		
	}

}
