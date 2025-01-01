package com.array;

public class CheckAssendingSortedArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		int [] b= {9,8,7,6,5,4,3,2,1};
		
		if(isSorter(a)) {System.out.println("A is Sorted array in assending order");} else {System.out.println("A is Not sorted assending array");}
		if(isSorter(b)) {System.out.println("B is Sorted array in assending order");} else {System.out.println("B is Not sorted assending array");}

	}
	
	public static boolean isSorter(int [] a) {
		for (int i = 0; i<a.length-1; i++) {
			if(a[i]>a[i+1]) return false;
		}
		return true;
	}

}
