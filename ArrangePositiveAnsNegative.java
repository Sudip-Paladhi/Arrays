package com.demo;

public class ArrangePositiveAnsNegative {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
		int[] b = new int[a.length];

		int posiviveInteger = 0;
		int negativeInteger = 1;

		for (int value : a) {
			if (value > 0) {
				b[posiviveInteger] = value;
				posiviveInteger += 2;
			} else {
				b[negativeInteger] = value;
				negativeInteger += 2;
			}
		}

		for (int i : b) {
			System.out.println(i + " ");
		}
	}
}