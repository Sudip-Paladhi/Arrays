package com.array;

public class FindSmalAndBig {

	public static void main(String[] args) {
		int [] a= {5,1,2,3,7,8,9,4,6};
		int small= a[0];
		int big=a[0];
		for (int i = 1; i < a.length; i++) {
				if(a[i]<small) small=a[i];
				if(a[i]>big) big= a[i];
		}
		System.out.println("Smallest number is: " + small);
		System.out.println("Biggest number is: " + big);
	}
}