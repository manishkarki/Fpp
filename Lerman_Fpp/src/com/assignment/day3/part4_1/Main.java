package com.assignment.day3.part4_1;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Pr", 45000, 2016, 9, 2, 11, 23, 00);
		Account[] acc = null;
		acc = new Account[3];
		acc[0] = new Account(emp, AccountType.CHECKING, 300.0);
		acc[1] = new Account(emp, AccountType.SAVINGS, 300.0);
		acc[2] = new Account(emp, AccountType.RETIREMENT, 300.0);
		for (Account acc1 : acc) {
			System.out.println(acc1.toString());
		}
		System.out.println(emp.getHireDay());

	}
}
