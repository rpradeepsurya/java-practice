package com.basics;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Login> tset = new TreeSet<>(new UNameCompare());
		
		tset.add(new Login("John", "123"));
		tset.add(new Login("Doe", "wer"));
		tset.add(new Login("Alan", "Xyz"));
		
		for (Login val: tset) {
			System.out.println(val);
		}

	}

}

class UNameCompare implements Comparator<Login> {

	@Override
	public int compare(Login l1, Login l2) {
		// TODO Auto-generated method stub
		return l1.getUserName().compareTo(l2.getUserName());
	}
	
}

class Login {

	private String userName;
	private String password;

	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Name = " + this.userName + " Password " + " = " + this.password;
	}

}
