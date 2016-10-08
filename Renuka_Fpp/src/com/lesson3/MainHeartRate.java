package com.lesson3;

public class MainHeartRate {
	
	public static void main(String[] args) {
		HeartRate heart = new HeartRate("Manish","Karki",1992,7,1);
		System.out.println("Hi"+" "+heart.getFirstName()+" "+heart.getLastName()+" "+"DOB:"+heart.getDateOfBirth().getTime());
		System.out.println("Your age is:"+heart.calculateAge());
		System.out.println("Your heart rate:"+heart.calculateMaximumHeartRate());
		System.out.println("Your target heart rate:"+heart.targetHeartRate());
	}
}
