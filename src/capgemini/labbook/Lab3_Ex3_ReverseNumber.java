package capgemini.labbook;

import java.util.Arrays;

public class Lab3_Ex3_ReverseNumber {
	public static int[] getSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// converting integer to string buffer to reverse
			StringBuffer sb = new StringBuffer(Integer.toString(arr[i]));
			arr[i] = Integer.parseInt(sb.reverse().toString());
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 15, 17, 29, 14, 18,198 };
		int[] nums = getSorted(arr);
		for (int num : nums)
			System.out.println(num + " ");
	}
}
