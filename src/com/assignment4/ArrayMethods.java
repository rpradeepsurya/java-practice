package com.assignment4;

public class ArrayMethods {

	public static void main(String[] args) {
		// 1. array equals
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,3,4};
		
		boolean isEqual = true;
		
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				isEqual = false;
				break;
			}
		}
		
		if (isEqual) System.out.println("Arrays are equal");
		else System.out.println("Arrays are not equal");
		
		
		// 2. ArrayIndexOutOfBoundException
		
		try {
			int[] arr3 = {1,2};
			int temp = arr3[10];
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound exception: " + e.getMessage());
		}

	}

}
