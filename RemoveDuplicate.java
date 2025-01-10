package com.demo;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 1, 8, 2, 5, 6 };
		// int[] b = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;

			for (int k = 0; k < j; k++) {
				if (a[k] == a[i]) {

					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				a[j++] = a[i];
			}
		}

		for (int i = 0; i < j; i++) {
			System.out.println(a[i]);
		}
	}
}
