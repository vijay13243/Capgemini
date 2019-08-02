package capgemini.labbook;

public class Lab1_Ex3_CheckNumber {
	public static boolean CheckNumber(int n) {
		String number = Integer.toString(n);
		for (int i = 0; i < number.length()-1 ; i++)
			if (number.charAt(i) < number.charAt(i + 1))
				return true;
		return false;
	}

	public static void main(String[] args) {
		int n = 134468;
		if (CheckNumber(n))
			System.out.println("Increasing Number");
		else
			System.out.println("Non Increasing Number");
	}

}
