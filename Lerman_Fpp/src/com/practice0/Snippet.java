package com.practice0;

public class Snippet {
	public static int stringToint(String str) {
		int i = 0, number = 0;
		boolean isNegative = false;
		if (str.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		int len = str.length();
		for (int j = 0; j < len; j++) {
			char check = str.charAt(j);
			if (check >= 'a' && check <= 'z' || check >= 'A' && check <= 'z') {
				System.out.println("No characters,Only Numbers as String ,Please!!");
				return 0;
			}
		}
		while (i < len) {
			System.out.println("number before"+number);
			number *= 10;
			System.out.println("number after multiplication"+number);
			number += (str.charAt(i++) - '0');
			System.out.println("number after calc"+number);
		}
		if (isNegative)
			number = -number;
		return number;
	}

	public static void main(String[] args) {

		String check = "102.33";
		String [] check1 = check.split(".");
		System.out.println(check1[0]);
		for(int i =0; i<check1.length; i++)
			System.out.println(check1[0]);
	}
}
