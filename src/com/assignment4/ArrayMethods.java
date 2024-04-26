package com.assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayMethods {

	public static void main(String[] args) {

		// 1. array equals

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 2, 3, 4 };

		boolean isEqual = true;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				isEqual = false;
				break;
			}
		}

		if (isEqual)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");

		// 2. ArrayIndexOutOfBoundException

		try {
			int[] arr3 = { 1, 2 };
			int temp = arr3[10];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound exception: " + e.getMessage());
		}

		// 3. Missing number in an array

		int[] input1 = { 10, 9, 6, 7, 4, 3, 5, 1, 2 };
		int[] input2 = { 6, 1, 4, 2, 3 };

		List<Integer> list1 = findMissingNum(input1);
		System.out.print("Missing numbers = ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}

		List<Integer> list2 = findMissingNum(input2);
		System.out.print("Missing numbers = ");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}

		// 4. Search element in an array

		int[] array = { 5, 1, 4, 2, 8, 3 };
		int target = 8;

		int index = linearSearch(array, target);

		if (index != -1)
			System.out.println("Element found at index: " + index);
		else
			System.out.println("Element not found in the array");

		// 5. Intersection between two arrays

		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 2, 3, 4, 7, 8 };

		Set<Integer> set1 = new HashSet<>();
		for (int num : array1) {
			set1.add(num);
		}

		System.out.print("Intersection = ");
		for (int num : array2) {
			if (set1.contains(num)) {
				System.out.print(num + " ");
			}
		}

		// 6. Sum of all the values in a given array

		int[] arrayZ = { 10, 43, 27, 98, 75, 59, 191 };
		int sum = 0;

		for (int num : array)
			sum += num;

		System.out.println("Sum of array: " + sum);

		// 7. check if array contains value or not

		String[] test = new String[] { "F", "J", "D", "H", "B", "R" };
		boolean foundJ = false;
		boolean foundO = false;

		for (String val : test) {
			if (val.equals("J"))
				foundJ = true;
			if (val.equals("O"))
				foundO = true;
		}

		System.out.println("J found? = " + foundJ);
		System.out.println("O found? = " + foundO);

	}

	public static List<Integer> findMissingNum(int[] array) {
		// find the missing number in the input array
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		int min = array[0];
		int max = array[0];

		for (int num : array) {
			if (num > max)
				max = num;
			else if (num < min)
				min = num;
			set.add(num);
		}

		for (int i = min; i <= max; i++) {
			if (!set.contains(i))
				list.add(i);
		}

		return list;
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
