//Author: Vijay
// Date: 24-july-2019
// purpose: Two mains in single class
public class MultiMain{
	
	public static void main(String args[]){
	  System.out.println("HELLO......");
		// calling another main method......
			main(new int[] {});

	}
         // main can be overloaded
	
	public static void main(int args[]){
		System.out.println("HI......");
	}
}
	