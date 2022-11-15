package Methods;

public class SRM_call_from_same_Class {
	public static void main(String[] args) {
		System.out.println("I am from main method");
		
		M1();
		M2(); 
		System.out.println("main Method ended");
	}

	public static void M1() {
		System.out.println("I am from Method 1");
		
	}
	public static void M2() {
		System.out.println("I am from M2");
	}
}
