package com.practice0;

import java.util.ArrayList;
import java.util.Arrays;

public class StringwithShortestLength {

	public static String returnStringWithShortestLength(ArrayList<String> a) {
		int min = 0, min1 = 0, index = 0;
		for (int j = 1; j < a.size(); j++) {
			min = a.get(j - 1).length();
			min1 = a.get(j).length();
			if (min > min1) {
				min = min1;
				if (min < a.get(index).length())
					index = j;
			}
		}
		return a.get(index);
	}

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>(Arrays.asList("ok", "owens", "bird", "o", "oks", "bird"));
		System.out.println("Minm string is:" + returnStringWithShortestLength(a));
	}
}
