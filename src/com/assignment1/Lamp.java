package com.assignment1;

public class Lamp {
	
	public boolean isOn = false;

	public static void main(String[] args) {
		// Task3
		

	}
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public void displayLampStatus() {
		System.out.println("Light On? " + isOn);
	}

}
