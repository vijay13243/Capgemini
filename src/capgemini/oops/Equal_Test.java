package capgemini.oops;

public class Equal_Test {
	public static void main(String[] args) {

		String name = "Capgemini";
		String company = new String("Capgemini");

		if (name == company)
			System.out.println("You are an employee....");

		else
			System.out.println("You are NOT an employee....");

		if (name.equals(company))
			System.out.println("Capgemini->You are an employee....");
		else
			System.out.println("Capgemini->You are NOT an employee....");

	}

}
