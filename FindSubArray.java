package com.demo;

public class FindSubArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 7, 5 };
		int target = 12;
		FindSum(a,target);

	}
	
	public static void FindSum(int [] a, int target) {
		for (int i = 0; i < a.length-1; i++) {
			int sum=0;
			for (int j = i; j < a.length; j++) {
				sum+=a[j];
				if(sum==target) {
					for (int k = i; k <=j; k++) {
						System.out.println(a[k] +" ");
					}
					return;
				}
			}
		}
	}

}
