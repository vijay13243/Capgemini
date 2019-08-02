package capgemini.lang;

import java.util.Arrays;

public class SimpleString {
	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		String s3 = new String("JAVA");
		// char[] value=new char[] {'J','A','V','A'};
		char[] value = { 'J', 'A', 'V', 'A' };
		String s4 = new String(value);
		String s5 = new String(s4);
		if (s1 == s2) { // values are same and memory location is also same
			System.out.println("s1==s2");
		}
		if (s1 != s2) { // values are same and memory location is different
			System.out.println("s1!=s3");
		}
		System.out.println("s1 equals s2: " + s1.equals(s2)); // true
		System.out.println("s1 equals s3: " + s1.equals(s3)); // true
		System.out.println("Length of String s1 : " + s1.length());
		System.out.println("Index of J : " + s1.indexOf('J'));
		System.out.println("Character at position 1 is  : " + s1.charAt(0));
		System.out.println("Concating of s1 and s2 :  " + s1.concat(s2));
		System.out.println("Ends with A or not:   " + s1.endsWith("A"));
		System.out.println("GET BYTES OF S1: " + Arrays.toString(s1.getBytes()));
		System.out.println("Index of sub string in s2: " + s2.indexOf("AVA"));
		System.out.println("EMPTY OR NOT: " + s1.isEmpty());
		System.out.println("S5 Starts with: " + s5.startsWith("J"));
		System.out.println("To UPPER CASE: " + s2.toUpperCase());
		System.out.println("To LOWER CASE: " + s1.toLowerCase());
		System.out.println("To char Array: " + Arrays.toString(s1.toCharArray()));
		System.out.println("TRIM: " + s1.trim() + " " + s2.trim());

	}

}
