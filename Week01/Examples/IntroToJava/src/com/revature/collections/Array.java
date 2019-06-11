package com.revature.collections;

public class Array {

	/*
	 * We can use arrays to hold groups (or collections of objects
	 * or primitives).
	 */
	
	public static void main(String[] args) {
		
		//There are a couple of valid ways to create arrays.
		
		int[] arr = new int[3];
		int arr2[] = new int[4];
		int arr3[] = new int[] {3, 4};
		int arr4[] = {3, 4, 55};
		
		//You can also create multi-dimensional arrays.
		
		int [][] arr5 = new int[][] {{322, 4}, {43, 221, 3222, 433}};
		int [] arr6[][] = new int[3][][];
		int [][] arr7[][] = new int[3][][][];
		
		/*
		 * Arrays are fixed in size, so you can't change the size once
		 * they've been declared.
		 */
	}
}
