package com.practice0;

public class ConvertCase {

	public static String convertCase(String s){
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c -= 32;
				System.out.println("c in lower converted"+c);
			} else if (c >= 'A' && c <= 'Z') {
				c += 32;
				System.out.println("c in upper converted"+c);
			}
			s1 += c;
		}
		System.out.println(s1);
		return s1;
	}
	public static void main(String[] args) {
		System.out.println("AsdFgh cmputed by conversionOfCase::"+convertCase("AsdFgh"));
	}
}
