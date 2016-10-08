package com.week1.lesson5;

public class Administrator extends DeptEmployee {

	Administrator(String aName, double aSalary, int aYear, int aMonth, int aDay, int hour, int minute, int sec,int hoursWorked) {
		super(aName, aSalary, aYear, aMonth, aDay, hour, minute, sec);
		this.workHours = hoursWorked;
	}

	private int workHours;

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	public double computeSalary(){
		return this.workHours*20;
	}
}
