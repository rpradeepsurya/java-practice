package com.assignment8;

public class Customer implements Comparable<Customer> {

	private int id;
	private String name;
	private long contactNum;
	private String city;

	public Customer(int id, String name, long contactNum, String city) {
		super();
		this.id = id;
		this.name = name;
		this.contactNum = contactNum;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Customer cust) {
		return this.name.compareTo(cust.name);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	
}
