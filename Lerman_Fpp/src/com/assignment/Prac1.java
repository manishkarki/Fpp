package com.assignment;

/*Consider the following if…then logic:
    if(age > 65) socialSecurityStatus = "eligible";
     else socialSecurityStatus = "ineligible";

    Rewrite this (pseudo) code using the Java ternary operator.*/

import java.util.Scanner;

public class Prac1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age to find eligibility");
		int age = scan.nextInt();
		String socialSecurityStatus = (age > 65) ? "eligible":"ineligible";
		System.out.println(socialSecurityStatus);
		String s = "a friendly face";
		System.out.println(s.substring(2,9) +" d"+
		         s.substring(4));
	}
}
