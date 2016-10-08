package com.practice0;

public class Merge {

	public static String mergeOrder(String s1, String s2) {
		String str = new String("");
		// str.concat(str)
		if (s1.isEmpty())
			return s2;
		if (s2.isEmpty())
			return s1;
		else {
			if (s1.compareTo(s2) < 1) {

				Character.toString(s1.charAt(0)).concat(str);
				str = str.concat(Character.toString(s1.charAt(0)));
				str = str.concat(mergeOrder(s1.substring(1), s2));
			} else {
				str = str.concat(Character.toString(s2.charAt(0)));
				str = str.concat(mergeOrder(s1, s2.substring(1)));
			}
			// String str="a";
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(mergeOrder("asdfgh", "manish"));
	}
}
