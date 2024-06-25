package Overloading_constractor;

public class teacher {
	String name,gender;
	int phone;
	
	teacher(){
		System.out.println("No information");	
	}
	teacher(String n,String g){
		name = n;
		gender = g;
		
		
	}
	
	teacher (String n,String g,int p){
		name = n;
		gender = g;
		phone = p;
	}
	
	void displayInformation() {
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Phone : "+phone);
		
	}

}
