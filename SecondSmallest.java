package com.Array;

public class SecondSmallest {

	public static void main(String[] args) {
		int [] a= {1,5,6,9,8,7,10,11,12,13};
		int s1= a[0];
		int s2=a[0];
		for (int i = 1; i < a.length; i++) {
			if(s1==a[i]) continue;
			
			if(s1>a[i]) {
				s2=s1;
				s1=a[i];
			} else if (s2>a[i] || s2==s1) {
				s2=a[i];
			}
		}
		System.out.println(s2);

	}

}
