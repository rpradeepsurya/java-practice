package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("pradeep");
		set.add("Surya");
		set.add("John");
		set.add("Doe");
		set.add("Surya");
		
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
