package Logical_Program;

public class Reverse_The_String_Palindrome {
public static void main(String[] args) {
	String Org= "MalayalaM";
	String Rev= "";
	for (int i=Org.length()-1;i>=0;i--) {
		Rev= Rev+Org.charAt(i);
		
	}
	System.out.println(Rev);
	
	{
if (Org.equals(Rev)) {
	System.out.println("Given String is Palindrome");
}
else {
	System.out.println("Given String is not a Palindrome");
}
	}
}
}
