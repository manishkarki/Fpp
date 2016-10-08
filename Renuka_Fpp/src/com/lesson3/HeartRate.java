package com.lesson3;

import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.Date;

public class HeartRate {
	private String firstName;
	private String lastName;
	private Calendar dateOfBirth;
	private int maximumHeartRate;
	private int age;

	public HeartRate(String fname, String lname, int year, int month, int day) {
		this.firstName = fname;
		this.lastName = lname;
		this.dateOfBirth = new GregorianCalendar(year,month,day);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int calculateAge() {
		Calendar today = new GregorianCalendar();
		int age = today.get(Calendar.YEAR) - this.dateOfBirth.get(Calendar.YEAR);
		// System.out.println("res:"+res);
		if ((this.dateOfBirth.get(Calendar.MONTH) > today.get(Calendar.MONTH))
				|| (this.dateOfBirth.get(Calendar.MONTH) == today.get(Calendar.MONTH)
						&& this.dateOfBirth.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}
		this.age = age;
		return age;
	}
	public int calculateMaximumHeartRate(){
		maximumHeartRate = 220- age;
		return maximumHeartRate;
	}
	 public String targetHeartRate(){
		 return (maximumHeartRate*0.5 + maximumHeartRate)+"-"+(maximumHeartRate*0.85 + maximumHeartRate);
	 }
}
