package com.assignment.day3.part4_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	Employee(String aName, double aSalary, int aYear,
	         int aMonth, int aDay,int hour,int minute,int sec) 
	{name = aName;
	salary = aSalary;
	GregorianCalendar cal =
	new GregorianCalendar(aYear,aMonth-1,aDay,hour,minute,sec);
	hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
	return name;
	}
	public double getSalary() {
	return salary;
	}
	//needs to be improved!!
	public Date getHireDay() {
	return hireDay;
	}

	public void raiseSalary(double byPercent) {
	double raise = salary * byPercent / 100;
	salary += raise;
	}
	public double yearlyFederalTax (){
		double salary = this.getSalary();
//		System.out.println("salary:"+salary);
		double tax = 0;
		if(salary <= 26000)
			tax = 0;
		else if( salary <50000)
			tax = 0.2*salary;
		else if(salary <80000)
			tax = 0.24*salary;
		else if(salary> 80000)
			tax = 0.28*salary;
		
		return tax;
	}
	//instance fields
	private String name;
	private double salary;
	private Date hireDay;
	
	public static void main(String[] args) {
		Employee emp = new Employee("Pr", 45000, 2016, 9, 2,10,23,00);
		System.out.format("Federal tax:: $%,08.2f", emp.yearlyFederalTax());
//		emp.yearlyFederalTax();
	}
}
