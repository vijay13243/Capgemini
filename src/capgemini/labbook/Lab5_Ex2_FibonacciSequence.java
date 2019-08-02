package capgemini.labbook;

public class Lab5_Ex2_FibonacciSequence {
	public static int recursiveFibonacci(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}

	public static int nonRecurFibonacci(int n) {
		int a, b, c = 1;
		a = b = 1;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		int n = 5;

		// Calling recursive method
		System.out.println("Calling Recursive Method");
		System.out.println(n + "th Fibonacci number is " + recursiveFibonacci(n));

		// calling Non recursive method
		System.out.println("Calling Non Recursive Method");
		System.out.println(n + "th Fibonacci number is " + nonRecurFibonacci(n));

	}

}
