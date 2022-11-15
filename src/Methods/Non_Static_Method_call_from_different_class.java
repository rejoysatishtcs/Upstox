package Methods;

public class Non_Static_Method_call_from_different_class {
	public static void main(String[] args) {
		
		Non_static_method_object_class Q= new Non_static_method_object_class();
		System.out.println("Main method started");
		Q.K1();
		Q.K2();
		Q.K3();
		System.out.println("Main method Ended");
	}

}
