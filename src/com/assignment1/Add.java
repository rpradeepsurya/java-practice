package com.assignment1;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// Task1
		System.out.println("==== Add numbers ====");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two integers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("Sum of two numbers = " + (num1 + num2));

		scan.close();

	}

}
