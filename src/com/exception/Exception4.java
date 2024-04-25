package com.exception;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;

		try {
			if (i == 5) {
				throw new ArithmeticException("Invalid Number");
			} else {
				System.out.println("Correct");
			}
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

		System.out.println("Continuing the application flow");
	}

}
