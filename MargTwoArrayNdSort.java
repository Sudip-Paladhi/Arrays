package com.practise;

//import java.util.Arrays;

public class MargTwoArrayNdSort {

	public static void main(String[] args) {
		int[] a = { 2, 8, 23, 7, 9, };
		int[] b = { 6, 4, 5, 2, 3, 7, 8 };
		int[] Array = merge(a, b);

		sortArray(Array);

		for (int i : Array) {
			System.out.println(i +" ");
		}
		
// Using bulletin method
//		System.arraycopy(a, 0, c, 0, a.length);
//		System.arraycopy(b, 0, c, a.length, b.length);
//		Arrays.sort(c);
//		for (int i : c) {
//			System.out.println(i);
//		}
	}

	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int index = 0;

		for (int n : a) {
			c[index++] = n;
		}
		for (int n : b) {
			c[index++] = n;
		}
		return c;
	}

	static void sortArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}