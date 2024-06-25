package List;

import java.util.LinkedList;

public class StudentList_Demo {
	
	public static void main (String []args) {
		
		LinkedList<Student> List = new LinkedList<Student>();
		
		Student s1 = new Student (101,"Karim","Eleven");
		Student s2 = new Student (102,"Rahim","Twelve");
		Student s3 = new Student (103,"Asif","One");
		Student s4 = new Student (104,"Rafi","two");
		Student s5 = new Student (105,"Mahi","Four");
		Student s6 = new Student (106,"Rahi","Five");
		
		
		List.add(s1);
		List.add(s2);
		List.add(s3);
		List.add(s4);
		List.add(s5);
		List.add(s6);
		
		
		for (Student s : List) {
			System.out.println(s.id+" "+s.name + " "+s.ClassName);
		}

		
	}
	
	
}
