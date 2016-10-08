package com.lesson2;

import java.util.Scanner;

public class WeightSwitch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of person in lbs");
		double input = scan.nextDouble();
		System.out.println("Enter choice 1-Venus,2-Mars,3-Jupiter,4-Saturn,5-uranus,6-Neptune");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			input *=0.78;
			break;
		case 2:
			input *=0.39;
			break;
		case 3:
			input *=2.65;
			break;
		case 4:
			input *=1.17;
			break;
		case 5:
			input *=1.05;
			break;
		case 6:
			input *=1.23;
			break;
		default:
			break;
		}
		System.out.printf("Your weight in choice of your planet is "+input);
	}
}
