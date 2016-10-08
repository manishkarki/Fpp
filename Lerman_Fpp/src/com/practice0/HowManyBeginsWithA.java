package com.practice0;

import java.util.ArrayList;
import java.util.Arrays;

public class HowManyBeginsWithA {
	
	public static int howManyBeginsWith_A_Or_a(ArrayList<String>a){
		int ret =0;
		for(int i =0; i<a.size(); i++){
			String check = a.get(i);
			char c = check.charAt(0);
			if(c == 'a' || c == 'A')
				ret++;
		}
		return ret;
	}
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>(Arrays.asList("ane", "A", "bird", "ok", "oks", "Aird"));
		System.out.println("string starting with A or a is:" +howManyBeginsWith_A_Or_a(a));
	}
}
