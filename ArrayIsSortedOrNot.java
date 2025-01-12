package com.demo;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		int[] a = { 1, 5, 7, 9 };
		if (IsSorted(a)) {
			System.out.println("Sorted array.");
		} else {
			System.out.println("Not sorted array.");
		}

	}

	public static boolean IsSorted(int[] a) {
		boolean assending = true;

		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i + 1]) {
				assending = false;
				break;
			}
		}

		if (!assending) {
			boolean dessending = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i] < a[i + 1]) {
					dessending = false;
					break;
				}
			}
			return dessending;
		}
		return assending;
	}

}
