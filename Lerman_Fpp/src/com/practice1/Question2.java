package com.practice1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Question2 {

	public boolean matchTwoLinkedLists(LinkedList<Integer> a , LinkedList<Integer> b){
		if(a == null || b == null || (a.size() != b.size()))
			return false;
		Iterator<Integer> iter = a.iterator();
		Iterator<Integer> iter1 =  b.iterator();
		while(iter.hasNext()){
			Integer chek = iter.next();
			Integer chek1 = iter1.next();
			if(chek != 100*chek1)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Question2 ques2 = new Question2();
		LinkedList<Integer> a = new LinkedList<>(Arrays.asList(200,300,400));
		LinkedList<Integer> b = new LinkedList<>(Arrays.asList(2,3,4));
		System.out.println("bool:"+ques2.matchTwoLinkedLists(a, b));;
	}
}
