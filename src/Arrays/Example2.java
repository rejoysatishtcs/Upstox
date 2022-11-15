package Arrays;

public class Example2 {
	public static void main(String[] args) {
		int ar[]=new int [6];
		ar [0]=500;
		ar[1]=600;
		ar[2]=700;
		ar[3]=800;
		ar[4]=900;
		ar[5]=1000;
		
	for (int i=0; i<=5; i++) {
		System.out.println(ar[i]);
	}
	{
	
	try {
		System.out.println(ar[6]);
		
	}
	catch (java.lang.ArrayIndexOutOfBoundsException Hello) {
		System.out.println("There is no data you are trying to fetch");
	}

}
	}
}
