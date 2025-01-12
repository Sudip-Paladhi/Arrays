package com.demo;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] a = { 5, 5, 44, 44, 2, 2, 3, 9, 7, 8 };

		for (int i = 0; i < a.length; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					duplicate = true;
				}
			}
			if (duplicate) {
				System.out.println(a[i]);
			}
		}
	}
}