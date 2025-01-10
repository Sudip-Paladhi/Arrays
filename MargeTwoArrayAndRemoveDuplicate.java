package com.demo;

import java.util.Arrays;

public class MargeTwoArrayAndRemoveDuplicate {

	public static void main(String[] args) {
		int[] a = { 5, 4, 9, 8, 2, 1 };
		int[] b = { 7, 0, 3, 4, 5, 8, 9, 1 };
		int[] result = RemoveDuplicate(a, b);
		System.out.println(Arrays.toString(result));
	}

	public static int[] RemoveDuplicate(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		Arrays.sort(c);
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			if (i == 0 || c[i] != c[i - 1]) {
				c[index++] = c[i];
			}
		}
		return Arrays.copyOf(c, index);
	}

}
