package com.exception;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int i = 20/0;
			System.out.println(i);
		}
		catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("Finally");
		}
		System.out.println("Continuing the application flow");

	}

}
