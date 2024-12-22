package com.Array;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {2,3,4,5,6,7,8,9};
		System.out.println(binary(a,3));
	}
	
	static int binary(int a[], int e) {
		int start=0, end= a.length-1;
		while(start<=end) {
			int mid= (start+end)/2;
			if(e== a[mid]) return mid;
			else if(e<a[mid]) end=mid-1;
			else start= mid+1;
		}
		return -1;
	}
}