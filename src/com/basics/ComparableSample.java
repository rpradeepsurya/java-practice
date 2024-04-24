package com.basics;

import java.util.TreeSet;

public class ComparableSample {
	
	public static void main(String[] args) {
		
		TreeSet<User> tset = new TreeSet<>();
		tset.add(new User("John"));
		tset.add(new User("Doe"));
		tset.add(new User("Jim"));
		tset.add(new User("Doe"));
		
		for (User user : tset) {
			System.out.println(user);
		}
	}
	
}

class User implements Comparable<User> {

	private String userName;
	
	
	public User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		return this.userName.compareTo(u.userName);
	}

	@Override
	public String toString() {
		return "Name = " + this.userName;
	}
	
	

}
