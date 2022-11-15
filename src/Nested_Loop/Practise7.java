package Nested_Loop;

public class Practise7 {
	public static void main(String[] args) {
		int Space=2;
		int Star=1;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=Space;j++) {
		System.out.print(" "); 
			}
			
		for (int j=1;j<=Star; j++) {
			System.out.print("*");
		}
			System.out.println();
		
		if (i<=2) {
			Space--;
			Star= Star+2;
			
		}
		else {
			Space++;
			Star=Star-2;
			
		}
				
				
				
		}

	
	}
	
	
	
}
