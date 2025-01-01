package com.array;

//Two Sum Problem:
//Find two numbers in an array that add up to a given target.
//(Input: [2, 7, 11, 15], Target: 9 → Output: [2, 7])

public class TwoSumProblem {

	public static void main(String[] args) {
		int[] a = { 2, 11, 15,7 };
		int target = 9;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println("Target: " + target + "  Output: " + a[i] + "," + a[j]);
				}
			}
		}

	}

}
