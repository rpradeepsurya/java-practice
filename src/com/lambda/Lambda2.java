package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Doe");
		list.add("Jack");
		list.add("Will");
		
		list.forEach((s)-> System.out.println(s));
	}

}
