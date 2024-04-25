package com.exception;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception5 ex = new Exception5();
		try {
			ex.ageValidation(12);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Continuing the application flow");
	}
	
	public void ageValidation (int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Not Eligible to Vote");
		}
		else {
			System.out.println("You can Vote!");
		}
	}

}
