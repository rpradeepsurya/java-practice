package com.assignment5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ArrayList to String

		List<String> language = new ArrayList<>();
		language.add("Java");
		language.add("C++");
		language.add("spring");
		language.add("Hibernate");

		System.out.println("String converted from ArrayList: " + String.join(", ", language));
		System.out.println("PIPE delimited String from ArrayList: " + String.join(" | ", language));
		System.out.println("Colon separated String from ArrayList: " + String.join(": ", language));

		
		// 2. Sublist from the array

		language.add("Rust");
		List<String> subList = language.subList(1, 4);
		System.out.println("SubList items are: " + String.join(", ", subList));
		

		// 3. Remove repeated elements in a list

		int[] list = { 1, 2, 2, 3, 4, 4, 4 };
		Set<Integer> set = new LinkedHashSet<>();

		for (int num : list)
			set.add(num);

		System.out.println(set);
		

		// 5a. HashSet to Array
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(44);
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(11);
		hashSet.add(1);

		System.out.println("HashSet: " + hashSet);
		
		Integer[] array = hashSet.toArray(new Integer[0]);
		
		System.out.print("Array: ");
		for (Integer num : array) 
			System.out.print(num + " ");
		System.out.println();
		
		// 5b. HashSet to TreeSet
		
		Set<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

	}

}
