package shape;

public class test {
	public static void main(String []args) {
		
		Shape s = new Shape();
		Rectangle r = new Rectangle(10,20);
		Triangle t = new Triangle (10,20);
		
		System.out.println(s.area());
		System.out.println(r.area());
		System.out.println(t.area());
	}

}
