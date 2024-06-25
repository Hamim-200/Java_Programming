package stati_keyword;

public class student {
	String name;
	int id;
	static String UniversityName= "NSU";
	
	student (String n, int i){
		name = n;
		id = i;
	}
	
	void displayInformation() {
		System.out.println("Name :" +name);
		System.out.println("Id :" +id);
		System.out.println("university Name :" +UniversityName);
	}

}
