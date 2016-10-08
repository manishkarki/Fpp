package com.practice0;

public class HowManyDigits {

	public static int countDigits(String s) { //module to count char in string
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			String s2= s.toLowerCase();
			char check = s2.charAt(i);
			System.out.println(check);
			if (check >= 'a' && check <= 'z') {
				System.out.println("true");
				count++;
			}
		}
		return count;
	}
	
	public static int countDigits1(String s) { //module to count number in string
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			String s2= s.toLowerCase();
			char number = s2.charAt(i);
			System.out.println(number);
			if (number >= '0' && number <= '9') {//mistakes: using number without quotes
				System.out.println("true");
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("number of digits in Hello 896 Bye 12::" + countDigits1("Hello 896 Bye 12"));
	}
}
