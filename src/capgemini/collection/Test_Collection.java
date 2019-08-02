package capgemini.collection;

import java.util.Arrays;

public class Test_Collection {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		for (int index = 0; index < nums.length; index++) {
			System.out.println(nums[index]);
		}
		System.out.println("Natural Order:  " + Arrays.toString(nums));
		
		// enhanced for loop .....not indexed based....
		
		for (int num : nums) {
			System.out.println(num);
		}
		// algorithm for arrays............
		
		// integer array........
		
		Arrays.sort(nums);
		System.out.println("Sorted Order:  " + Arrays.toString(nums));
		
		// char array.....
		
		char[] alpha = { 'A', 'B', 'C', 'D', 'E' };
		System.out.println("Natural Order:  " + Arrays.toString(alpha));
		
		// string array...........
		
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		Arrays.sort(days);
		System.out.println("Sorted Order:  " + Arrays.toString(days));

	}
}
