package com.practice1;

import java.util.Iterator;
import java.util.LinkedList;

public class PalindromeCheckLinkedList {

	@SuppressWarnings("rawtypes")
	public static boolean checkPalindrome(String s){
		if(s == null)
			return false;
		LinkedList<Character> stack = new LinkedList<>();
		LinkedList<Character> queue = new LinkedList<>();
		for(int i =0; i<s.length(); i++){
			char c = s.charAt(i);
			stack.push(c);
			queue.add(c);
		}
		Iterator iter = stack.iterator();
		while(iter.hasNext()){
			char check1 = stack.pop();
			char check = queue.poll();
			if(check1 != check)
				return false;
		}
		System.out.println("size of stack is:"+stack.size()+" and queue is:"+queue.size());
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("madam"));
	}
}
