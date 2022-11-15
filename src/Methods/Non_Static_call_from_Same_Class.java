package Methods;

public class Non_Static_call_from_Same_Class {
	
	public void N1() {
	System.out.println("I am from N1");
	}
	public void N2() {
		System.out.println("I am from N2 non static method");
	}
	public void N3() {
		System.out.println("I am from N3 non static method");
	}
	
	public static void main(String[] args) {
		
		Non_Static_call_from_Same_Class R= new Non_Static_call_from_Same_Class();
		System.out.println("Main method started");
		R.N1();
		R.N2();
		R.N3();
		System.out.println("main method ended");
		
	}
	
	
	
}
