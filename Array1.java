package com.Array;

public class Array1 {
	
    public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	int b[] = {5,7,5,4,5};
    	m1(a);
    	m1(b);
    }
    
    public static void m1(int []a) {
    	for(int n:a) {
    		System.out.print(n+" ");
    	}
    	System.out.println();
    }   
}