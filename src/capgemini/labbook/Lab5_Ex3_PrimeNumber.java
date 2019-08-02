package capgemini.labbook;

import java.util.Scanner;

public class Lab5_Ex3_PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		for (int i = 1; i < n; i++) {
			int j;
			for (j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0)
					break;
			}
			if (j > Math.sqrt(i))
				System.out.print(i + " ");
		}
		scan.close();
	}
}