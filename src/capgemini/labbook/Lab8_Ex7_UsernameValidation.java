package capgemini.labbook;

import java.util.Scanner;

public class Lab8_Ex7_UsernameValidation {
	public static boolean ValidateUsername(String username){
		if(username.endsWith("_job")&& username.length()==12){
			return true;
		}
		else return false;
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String username;
	System.out.println("Enter Username:");
	username=sc.next();
		if(ValidateUsername(username))
			System.out.println("Valid");
		else
			System.out.println("INvalid");

	}	
	
}
