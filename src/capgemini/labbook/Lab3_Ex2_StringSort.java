package capgemini.labbook;

import java.util.Arrays;

public class Lab3_Ex2_StringSort {
	public static String[] sortString(String[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (n % 2 == 0) {
				if (i < n / 2)
					arr[i] = arr[i].toUpperCase();
				else
					arr[i] = arr[i].toLowerCase();

			}
			 if (n % 2 != 0) {
				if (i < (n / 2) + 1)
					arr[i] = arr[i].toUpperCase();
				else
					arr[i] = arr[i].toLowerCase();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		String[] arr = { "vijay", "sriram", "shankarrao", "ramendra"," Praveen" };
		sortString(arr);
		for (String str : arr)
			System.out.print(str + " ");

	}
}
