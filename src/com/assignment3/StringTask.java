package com.assignment3;

public class StringTask {

	public static void main(String[] args) {
		// 3.2 String comparison
		String s1 = "Java";
		String s2 = "JAVa";
		
		// string value comparison
		boolean isEqual = valueCompare(s1, s2);
		if (isEqual) System.out.println("s1 and s2 strings are equal by value");
		else System.out.println("s1 and s2 strings are not equal by value");
		
		// string reference comparison
		if (s1 == s2) System.out.println("s1 and s2 strings are equal by value and reference");
		else System.out.println("s1 and s2 strings are neither equal by value nor by reference");

	}
	
	public static boolean valueCompare (String s1, String s2) {
		
		if (s1.length() != s2.length()) return false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) return false;
		}
		
		return true;
	}

}
