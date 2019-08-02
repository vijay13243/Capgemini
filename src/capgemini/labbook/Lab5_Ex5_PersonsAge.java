package capgemini.labbook;

import java.util.Scanner;

public class Lab5_Ex5_PersonsAge {
	public static boolean validateAge(int age) throws PersonAgeException {
		if (age < 15)
			throw new PersonAgeException("Age is below 15 years");
		else
			return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter person age:");
		int age = scan.nextInt();
		try {
			if (validateAge(age))
				System.out.println("Valid");
		} catch (PersonAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		scan.close();
	}
}

class PersonAgeException extends Exception {
	public PersonAgeException(String message) {
		super(message);
	}
}