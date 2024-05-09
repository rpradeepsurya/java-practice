package com.assignment8;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	UserNotFoundException(String msg) {
		super(msg);
	}

}
