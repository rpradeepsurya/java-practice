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
		
		// 3. Missing number in an array
		
		
		// 4. Search element in an array
		int[] array = {5, 1, 4, 2, 8, 3};
		int target = 8;
		
		int index = linearSearch(array, target);
		
		if (index != -1) System.out.println("Element found at index: " + index);
		else System.out.println("Element not found in the array");
		
		
		// 5. Intersection between two arrays
		
		
		// 6. Sum of all the values in a given array
		
		int[] array = {10, 43, 27, 98, 75, 59, 191};
		int sum = 0;
		
		for (int num: array) sum += num;
		
		System.out.println("Sum of array: " + sum);
		
		
		// 7. check if array contains value or not
		
		
		

	}
	
	public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
