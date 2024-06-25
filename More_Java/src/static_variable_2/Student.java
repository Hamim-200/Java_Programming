package static_variable_2;

public class Student {
	static int count = 0;
	
	Student (){
		count++;
	}
	
	void totalStudent () {
		System.out.println("Total student = "+count);
	}

}
