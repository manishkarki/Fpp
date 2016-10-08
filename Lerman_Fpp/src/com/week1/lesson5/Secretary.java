package com.week1.lesson5;

public class Secretary extends DeptEmployee {
	
	Secretary(String aName, double aSalary, int aYear, int aMonth, int aDay, int hour, int minute, int sec, double overTime) {
		super(aName, aSalary, aYear, aMonth, aDay, hour, minute, sec);
		this.overTimeHours = overTime;
	}
	double overTimeHours;
	public double getOverTimeHours() {
		return overTimeHours;
	}
	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	public double computeSalary(){
		return this.overTimeHours*12 + super.computeSalary();
	}
}
