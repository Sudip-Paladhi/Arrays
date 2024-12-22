package com.Array;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {8,4,1,7,2,3,9,6};
		sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	private static void sort(int [] a) {
		for (int i = 0; i < a.length-1; i++) {
			int index= i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[index]) index= j;	
			}
			int temp= a[index];
			a[index]= a[i];
			a[i]= temp;
		}
	}

}
