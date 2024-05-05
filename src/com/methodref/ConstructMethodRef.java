package com.methodref;

public class ConstructMethodRef {

	public static void main(String[] args) {
		
		Message msg = Display::new;
		msg.getMessage("Constructor method reference");

	}
}

class Display {
	Display(String msg) {
		System.out.println(msg);
	}
}

@FunctionalInterface
interface Message {
	Display getMessage(String msg);
}
