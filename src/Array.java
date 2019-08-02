import java.util.Arrays;

public class Array {
	public static int min(int[] nums) {
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i])
				min = nums[i];
		}
		return min;
	}



	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int min = min(nums);
		System.out.println("min:" + min);
		System.out.println(Arrays.toString(nums));
		// enhanced forloop
		for (int num : nums)
			System.out.println(num);
		String[] countries = { "INDIA", "JAPAN", "CHINA" };
		System.out.println(Arrays.toString(countries));
		for (String str : countries)
			System.out.println(str);
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		System.out.println(Arrays.toString(vowels));
		for (char ch : vowels)
			System.out.println(ch);
	}
}
