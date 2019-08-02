package capgemini.labbook;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab8_Ex1_StringTokenizer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integers");
		String s = scan.nextLine();
		int result = 0;
		StringTokenizer strToken = new StringTokenizer(s, " ");
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println(token);
			result = result + Integer.parseInt(token);
		}
		System.out.println("Sum of the num`bers is " + result);
		scan.close();
	}
}
