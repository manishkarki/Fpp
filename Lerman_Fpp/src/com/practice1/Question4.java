package com.practice1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Question4 {

	public static int returnMaximum(LinkedList<Integer> a) {
		if (a == null)
			return 0;
		Iterator<Integer> iter = a.iterator();
		int max = a.pop();
		while (iter.hasNext()) {
			int max1 = a.pop();
			if (max < max1)
				max = max1;
		}
		return max;
	}

	public static int findMinimum(LinkedList<Integer> a) {
		if (a == null)
			return 0;
		Iterator<Integer> iter = a.iterator();
		int min = a.pop();
		while(iter.hasNext()){
			int min1 = a.pop();
			if(min1 < min){
				min = min1;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<>(Arrays.asList(1, 3, 4, 10, 12, 14, 9));
		LinkedList<Integer> b = new LinkedList<>(Arrays.asList(1, 3, 4, 10, 12, 14, 9));
		System.out.println("Maximum:"+returnMaximum(a));
		System.out.println("Minimum:"+findMinimum(b));
	}
}
