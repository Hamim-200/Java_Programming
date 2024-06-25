package super_keyword;

public class car extends vehicle{
	int gear ;

	
	car(String c,double w,int g){
		super (c,w);
		gear = g;
	}
	
	
	@Override
	void attribute() {
		super.attribute();
		System.out.println("Gear : "+gear);
	}
}
