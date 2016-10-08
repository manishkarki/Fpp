package com.practice1;

import java.util.Comparator;

class Student implements Comparator<String>,Comparable<Integer>{
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

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

	@Override
	public String toString() {
		String ret = "Information:" + "name:" + this.name + "id:" + this.id;
		return ret;
	}

	@Override
	public int compare(String x, String y) {
		// Assume neither string is null. Real code should
		// probably be more robust
		// You could also just return x.length() - y.length(),
		// which would be more efficient.
		if (x.length() < y.length()) {
			return -1;
		}
		if (x.length() > y.length()) {
			return 1;
		}
		return 0;
	}

	@Override
	public int compareTo(Integer id) {
		if(this.id< id)
			return -1;
		if(this.id> id)
			return 1;
		return 0;
	}
}
