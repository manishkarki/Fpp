package com.week1.lesson5;

public class Professor extends DeptEmployee {

	Professor(String aName, double aSalary, int aYear, int aMonth, int aDay, int hour, int minute, int sec,int numberOfPub) {
		super(aName, aSalary, aYear, aMonth, aDay, hour, minute, sec);
		this.setNumberOfPublications(numberOfPub);
	}
	
	int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
