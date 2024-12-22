package com.Array;

public class Reverse {

	public static void main(String[] args) {
		int [] a= {2,5,4,9,8,7,3,5,1};
		int i=0;
		int j= a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]= a[j];
			a[j]= temp;
			i++;
			j--;
		}
		for(int n:a) {
			System.out.println(n);
		}
	}

}
