package problem_solving;

public class rectangle extends Shape {
	
	rectangle (double dim1,double dim2){
		super(dim1,dim2);
		
	}
	
	void area () {
		double result = dim1 * dim2;
		System.out.println("Rectangle area :"+ result);
	}
	

}
