package Methods;

public class Static_Call_from_different_class {
	public static void main(String[] args) {
		System.out.println("Main method started");
		SRM_Call_from_different_class.M1();
		SRM_Call_from_different_class.M2();
		SRM_Call_from_different_class.M3();
		
		System.out.println("main method ends");
	}

}
