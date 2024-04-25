package com.exception;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		String s = null;
		
		try {
			System.out.println(s.length());
			i = 10/0;
			System.out.println(i);
		}
		catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		catch (Exception e) { // Exception class catch block should be the last catch block in the structure
			e.printStackTrace();
		}

	}

}
