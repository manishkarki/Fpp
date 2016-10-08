package com.assignment;

public class PalindromeCheck {

	public static void main(String[] args) {
		String palcheck = "A man, a plan, a canal, Panama!";
		String palCheckRef =palcheck.replaceAll("[^a-zA-z]", "").toLowerCase();
		boolean palindrome = true;
		for( int i =0; i<palCheckRef.length(); i++){
			if(palCheckRef.charAt(i)!= palCheckRef.charAt(palCheckRef.length()-i-1)){
				palindrome = false;
				break;
			}
		}
		if(palindrome)
			System.out.println("Palindrome check:true");
		System.out.println(palCheckRef);
	}
}
