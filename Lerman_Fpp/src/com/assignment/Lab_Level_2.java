package com.assignment;

public class Lab_Level_2 {
	public static void checkPalindrome(String pal) {
		String pal1 = pal.replaceAll("[^a-zA-Z]", "").toLowerCase();
//		System.out.println("new string:" + pal1);
		boolean palindrome = true;
		for (int i = 0; i < pal1.length() / 2; i++) {
			if (pal1.charAt(i) != pal1.charAt(pal1.length() - i - 1)) {
				System.out.println("Not a palindrome");
				palindrome = false;
				break;
			} 
		}
		if(palindrome)
				System.out.println("String provided is a palindrome");
	}

	public static void main(String[] args) {
		checkPalindrome("A man, a plan, a canal, Panama!");
	}
}
