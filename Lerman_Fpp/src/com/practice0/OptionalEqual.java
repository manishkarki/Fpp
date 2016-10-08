package com.practice0;

import com.assignment.day3.Employee;

public class OptionalEqual {

	private String name;

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Employee))
			return false;

		Employee other = (Employee) o;
		if (this.name != other.getName())
			return false;

		return true;
	}
}
