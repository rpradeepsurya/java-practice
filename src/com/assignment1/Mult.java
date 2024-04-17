package com.assignment1;

import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		// Task 5
		
		System.out.println("==== Multiply two numbers ====");
		Scanner scan = new Scanner(System.in);

		System.out.print("Input first number: ");
		int num1 = scan.nextInt();
		
		System.out.print("Input second number: ");
		int num2 = scan.nextInt();

		System.out.println("Product of two numbers = " + (num1 * num2));

		scan.close();

	}

}
