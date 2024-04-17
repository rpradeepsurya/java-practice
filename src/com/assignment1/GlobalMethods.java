package com.assignment1;

import java.util.Scanner;

public class GlobalMethods {

	public static void main(String[] args) {
		// Task 2

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name 1: ");
		String name1 = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Enter name 2: ");
		String name2 = scan.nextLine();
		
		System.out.println();

		System.out.println(addFriends(name1, name2));
		scan.close();

	}
	
	private static String addFriends (String name1, String name2) {
		
		return name1 + " and " + name2 + " are friends";
	}

}
