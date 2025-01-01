package com.array;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] a = { 2, 4, 8, 70, 1, 0, 9, 0, 7 };
		Sorted(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void Sorted(int[] a) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[index++] = a[i];
			}
		}

		while (index < a.length) {
			a[index++] = 0;
		}
	}
}