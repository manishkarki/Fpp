package com.week1.lesson5;

import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {
	private String name;
	private double salary;
	private Date hireDay;
	DeptEmployee(String aName, double aSalary, int aYear,
	         int aMonth, int aDay,int hour,int minute,int sec) 
	{name = aName;
	salary = aSalary;
	GregorianCalendar cal =
	new GregorianCalendar(aYear,aMonth-1,aDay,hour,minute,sec);
	hireDay = cal.getTime();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDay() {
		return hireDay;
	}
	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	public double computeSalary(){
		return this.salary;
	}
}
