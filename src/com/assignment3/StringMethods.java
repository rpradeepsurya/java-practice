package com.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		// 3.3 String methods
		
		// a. string length
		String s1 = "Java is an object oriented programming language";
		String s2 = "Author name is James Gosling";
		
		System.out.println("Length of s1 = " + s1.length());
		System.out.println("Length of s2 = " + s2.length());
		System.out.println();
		
		// b. index position
		int count = 0;
		System.out.print("Indices of 'a' in s1 are ");
		for (int i=0; i<s1.length(); i++) {
			if (s1.charAt(i) == 'a') {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nTotal number of occurences of 'a' in s1 = " + count);
		System.out.println();
		
		// c. display single character
		System.out.println("First Index of character 'n' = " + s1.indexOf('n'));
		System.out.println("First Index of character 'j' = " + s1.indexOf('j'));
		System.out.println("First Index of character 'l' = " + s1.indexOf('l'));
		System.out.println("First Index of character 'g' = " + s1.indexOf('g'));
		
		
		// d. string equals method
		System.out.println("Equals method output for s1 and s2: " + s1.equals(s2));
		System.out.println();
		
		// 3.4 
		String s3 = " Java Developer name is Jagadesh ! ";
		String s4 = "Encapsulation";
		
		// trim leading and trailing spaces 
		System.out.println(s3.trim());
		
		// replace char 'a' to 'e'
		System.out.println(s4.replace('a', 'e'));
		System.out.println();
		
		// 3.5 string to string array
		String s5 = "welcome to java learning";
		String[] words = s5.split(" ");
		
		for (String word: words)
			System.out.println(word);
		
		System.out.println();
		// 3.6 character array into string
		char[] ch = {'h', 'e', 'l', 'l', 'o'};
		System.out.println("Character array into string: " + new String(ch));
		
		System.out.println();
		
		//3.7 print names until 'n'
		
		List<String> names = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		String response = "y";
		
		while (response.equals("y")) {
			
			System.out.print("Enter your name: ");
			String name = scan.nextLine();
			names.add(name);
			
			System.out.println("The name list: " + String.join(", ", names));
			
			System.out.print("Do you want to continue (y/n): ");
			response = scan.nextLine();
			
		}
		System.out.println("Exit.");
		System.out.println("The name list below:");
		
		for (int i=1; i<=names.size(); i++) 
			System.out.println(i + ". " + names.get(i-1));
		
	}

}
