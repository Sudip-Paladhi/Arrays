package com.array;

public class MergeTwoSorterArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int [] b= {6,7,8,9,10};
		
		int [] mergArray= Merge(a,b);
		for (int i : mergArray) {
			System.out.println(i);
		}
		
	}
	
	public static int[] Merge(int [] a, int [] b) {
		int [] c= new int[a.length+b.length];
		int i=0,  j=0, k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++]= a[i++];
			else c[k++]= b[j++];
		}
		while(i<a.length) c[k++]= a[i++];
		while(j<b.length) c[k++]= b[j++];
		return c;
	}

}
