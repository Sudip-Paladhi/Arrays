package com.demo;

public class TwoSumProblem {

	public static void main(String[] args) {
		int[] a = { 5, 1, 2, 9, 8, 7 };
		int target = 9;
		FindSum(a, target);
	}

	public static void FindSum(int[] a, int target) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(a[i] + "+" + a[j] + " = " + target);
					return;
				}
			}
		}
	}

}
