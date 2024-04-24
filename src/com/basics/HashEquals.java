package com.basics;

import java.util.HashSet;
import java.util.Set;

public class HashEquals {
	
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashEquals heq1 = new HashEquals();
		HashEquals heq2 = new HashEquals();
		
		heq1.setId(100);
		heq2.setId(100);
		
		System.out.println(heq1.equals(heq2));
		
		Set<HashEquals> set = new HashSet<>();
		set.add(heq1);
		set.add(heq2);
		
		System.out.println(set);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashEquals other = (HashEquals) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	 

}
