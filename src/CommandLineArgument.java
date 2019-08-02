//Author: Vijay
// Date: 24-july-2019
// purpose: command line arguments

public class CommandLineArgument{
	
	public static void main(String args[]){
		String value1,value2;
		// inline initialization
		value1=value2=null;
		// TAking arguments from command line
		value1=args[0]; 
		value2=args[1];
		
		//accessing
		System.out.println("value1:" +value1);
		System.out.println("value2:" +value2);
	}
}