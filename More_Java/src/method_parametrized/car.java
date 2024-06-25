package method_parametrized;

public class car {
	String name,color,model;
	int registration , numberplate ;
	
	void setInfromation(String a,String b,String c,int d, int e) {
		 name=a;
		 color=b;
		 model=c;
	     registration=d;
		 numberplate=e;
	}
	
	
	void displayInformation() {
		System.out.println("Name="+name);
		System.out.println("Color="+color);
		System.out.println("Model="+model);
		System.out.println("Reg.num="+registration);
		System.out.println("Number Id="+numberplate);
		System.out.println("\n");
	}
}
