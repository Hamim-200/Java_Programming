package problem_solving;

public class test {
	public static void main(String []args) {
		
		Shape shape;
		
		shape = new rectangle(10,20);
		shape.area();
		
		shape = new Triangle(10,20);
		shape.area();
		
		shape = new Circle(10);
		shape.area();
		
		
	}

}
