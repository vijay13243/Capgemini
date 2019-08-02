package capgemini.labbook;

import java.util.Arrays;

public class Lab3_Ex1_SecondSmallest {
	public static int getSecondSmallest(int[] nums){
		Arrays.sort(nums);
		return nums[1];
	}
	public static void main(String[] args) {
		int[] arr={1,8,40,50,60,10,2,70};
		System.out.println("SECOND SMALLEST NUMBER IS: " +getSecondSmallest(arr));
	}
}

