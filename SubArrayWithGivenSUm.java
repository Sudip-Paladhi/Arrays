package com.array;

//Subarray with Given Sum:
//Find a contiguous subarray that sums up to a given value.
//(Input: [1, 2, 3, 7, 5], Sum: 12 → Output: [2, 3, 7])

public class SubArrayWithGivenSUm {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 7, 5 };
		int target = 12;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i; j < a.length; j++) {
				count += a[j];
				if (count == target) {
					for (int k = i; k <= j; k++) {
						System.out.println(a[k] + "");
					}
					return;
				}
			}
		}
		System.out.println("Otput not found");

	}

}
