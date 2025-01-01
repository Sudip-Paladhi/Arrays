package com.practice;

public class FindMissingNum {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,7,8,9};
		int n= a.length+1;
			System.out.println(MissingNum(a, n));

	}
	
	public static int MissingNum(int [] a, int n) {
		int totalSum= n * (n+1)/2;
		
		int sum=0;
		for (int i : a) {
			sum+=i;
		}
		
		return totalSum-sum;
	}

}
