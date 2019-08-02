import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);

	static int add(int no1, int no2) {
		return no1 + no2;
	}

	static int sub(int no1, int no2) {
		return no1 - no2;
	}

	static int mul(int no1, int no2) {
		return no1 * no2;
	}

	public static void main(String args[]) {
		int no1, no2, result1 = 0, result2 = 0, result3 = 0;

		System.out.println("ENTER NO1:");
		System.out.println("ENTER NO2:");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		//no1 = 10;
		//no2 = 20;
		result1 = add(no1, no2);
		// result=no1+no2;
		System.out.println("ADD:" + result1);
		// result=no1-no2;
		result2 = sub(no1, no2);
		System.out.println("SUB:" + result2);
		// result=no1*no2;
		result3 = mul(no1, no2);
		System.out.println("mul:" + result3);
	}
}
