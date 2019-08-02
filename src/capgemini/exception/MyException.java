package capgemini.exception;

public class MyException {
	static int div1(int no1, int no2) { // un handled exception type exception
		try {
			if (no2 <= 0)
				throw new Exception("no2 has a value :" + no2);
		} catch (Exception ex) {
			System.err.println("cannot divide by zero.....");
		}
		return no1 / no2;
	}

	static int div2(int no1, int no2) throws Exception {
		if (no2 <= 0)
			throw new Exception("no2 has a value :" + no2);
		return no1 / no2;
	}

	public static void main(String[] args) {
		System.out.println("Started.......");
		if (args.length < 2) {
			System.out.println("Please provide two arguments....");
			System.exit(0);
		}

		int no1, no2, result;
		no1 = no2 = result = 0;
		try {
			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[1]);
			result = no1 / no2;
			System.out.println("RESULT: " + result);
		} catch (NumberFormatException ex) {
			System.err.println("PLEASE PROVIDE 2 NUMERIC ARGUMENT");
			// ex.printStackTrace();
		} catch (ArithmeticException ex) {
			System.err.println("PLEASE PROVIDE 2nd non 0 NUMERIC ARGUMENT.....");
		} finally {
			System.out.println("I will reach in any conditions.....");
		}
		System.out.println("ended");

		// unhandled exception type file not found exception
		// file inputStream fileInput=new FileInputStream("D: \\Readme.txt);
	}
}
