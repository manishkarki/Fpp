package com.practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Question1 {

	public LinkedList<Integer> getMoreThan50(LinkedList<Integer> a) {
		LinkedList<Integer> ret = new LinkedList<>();
		Iterator<Integer> iter = a.iterator();
		while (iter.hasNext()) {
			Integer add = iter.next();
			if (add > 50)
				ret.add(add);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Question1 ques1 = new Question1();
		LinkedList<Integer> a = new LinkedList<>(Arrays.asList(10,20,55,53,60,70));
		LinkedList<Integer> b = ques1.getMoreThan50(a);
		Collections.sort(b);
		System.out.println(b);
	}
}
