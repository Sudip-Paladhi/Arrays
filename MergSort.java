package com.Array;

public class MergSort {

	static void merg(int a[], int b[], int c[]) {
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++]= a[i++];
			else c[k++]= b[j++];
		}
		while(i<a.length) c[k++]= a[i++];
		while(j<b.length) c[k++]= b[j++];
	}
	
	public static void sort(int [] a) {
		if(a.length==1) return;
		int[] left= new int[a.length/2];
		int[] right= new int[a.length- left.length];
		for (int i = 0; i < left.length; i++) {
			left[i]= a[i];
		}
		
		for (int i = 0; i < right.length; i++) {
			right[i]= a[left.length+i];
		}
		sort(left);
		sort(right);
		merg(left, right, a);
	}
	
	public static void main(String[] args) {
		int [] a= {8,7,5,2,1,3,4,6,9};
		sort(a);
		for (int n:a) {
			System.out.println(n);
		}
	}

}
