package com.array;

public class Removeduplicate1 {

	public static void main(String[] args) {
		int[] a = { 2, 5, 6, 6, 9, 6 };
		int n = a.length;
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int k = 0; k < j; k++) {
				if (a[i] == temp[k]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				temp[j++] = a[i];
			}
		}

		// Print unique elements
		System.out.println("Array after removing duplicates:");
		for (int i = 0; i < j; i++) {
			System.out.println(temp[i]);
		}

	}

}
