package com.assignment8;

public class DuplicateEntryException extends Exception{
	
	private static final long serialVersionUID = 1L;

	DuplicateEntryException (String msg) {
		super(msg);
	}

}
