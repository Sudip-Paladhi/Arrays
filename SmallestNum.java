package com.Array;

public class SmallestNum {

	public static void main(String[] args) {
		int [] a= {9,8,5,6,7,2,3,1};
		int main =a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]<main) main= a[i];
		}
		System.out.println(main);
	}
}