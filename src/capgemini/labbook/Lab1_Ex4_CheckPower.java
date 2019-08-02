package capgemini.labbook;

public class Lab1_Ex4_CheckPower {
	public static boolean CheckNumber(int n) {
		while (n >1) {
			if (n % 2 == 1)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 9;
		if (CheckNumber(n))
			System.out.println("power of 2");
		else
			System.out.println("Not power of 2");
	}

}
