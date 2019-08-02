package capgemini.labbook;

public class Lab3_Ex4_Count {
	public static void Count(char[] c) {
		int len = c.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = 0; j < len; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}
			System.out.println(c[i] + " : " + count);
		}
	}

	public static void main(String[] args) {
		char[] ch = { 'V', 'I', 'J', 'A', 'Y', 'P', 'A', 'W', 'A', 'N' };
		Count(ch);
	}
}
