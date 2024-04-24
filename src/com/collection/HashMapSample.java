package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "John");
		map.put(2, "Doe");
		map.put(null, "Jim");
		map.put(125, "Jack");
		map.put(115, "Doe");
		map.put(null, "Alan");
		map.put(110, null);
		map.put(111, null);
		map.put(200, null);
		
		// allows one null key
		for (Map.Entry<Integer, String> val: map.entrySet()) {
			System.out.println(val.getKey() + " : " + val.getValue());
		}
	}

}
