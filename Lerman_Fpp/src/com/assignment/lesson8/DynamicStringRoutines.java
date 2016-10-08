package com.assignment.lesson8;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class DynamicStringRoutines {
	LinkedList<Character> a = new LinkedList<Character>();
	LinkedList<Character> b = new LinkedList<Character>();
	LinkedList<Character> c = new LinkedList<Character>();

	public void readstring(String name, String text) {
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			getLinkedList(name).add(c);
		}
	}

	public void writeString(String name) {
		Iterator iter = getLinkedList(name).iterator();
		System.out.print("OutPut:::");
		while (iter.hasNext()) {
			Object out = iter.next();
			System.out.print(out);
		}
		System.out.println();
	}

	public void concatenateString(String target, String name) {
		getLinkedList(target).add(' ');
		Iterator iter = getLinkedList(name).iterator();
		while (iter.hasNext()) {
			Object out = iter.next();
			getLinkedList(target).add((Character) out);
			// System.out.print(out+"");
		}
	}

	public boolean equals(String linked1, String linked2) {
		Iterator iter1 = getLinkedList(linked1).iterator();
		Iterator iter2 = getLinkedList(linked2).iterator();
		while (iter1.hasNext() && iter2.hasNext()) {
			char c = (Character) iter1.next();
			char c1 = (Character) iter2.next();
			if (c != c1)
				return false;
		}
		return true;
	}

	public int findLength(String name) {
		Iterator iter = getLinkedList(name).iterator();
		int count = 0;
		String a = "";
		while (iter.hasNext()) {
			char c = (Character) iter.next();
			a += c;
		}
		count = a.length();
		System.out.println("count:" + count);
		return count;
	}

	public void clear(String name) {
		getLinkedList(name).clear();
	}

	public int search(String search, String target, String start) {
		int j = 0, pos = 0;
		char d = search.charAt(0);
		boolean found = false;
		int start1 = Integer.parseInt(start);
		for(int i =start1; i<getLinkedList(target).size() && pos ==0; i++){
			char check = getLinkedList(target).get(i);
			if (check == d) {
//				System.out.println("d:"+d+" i:"+i);
				pos = i;
				found = true;
			}
		}
		if (found)
			for (int i = pos + 1; i < (pos + search.length()); i++) {
				j++;
				char c = getLinkedList(target).get(i);
				char c1 = search.charAt(j);
				if (c != c1) {
//					System.out.println("c:" + c + " c1:" + c1);
					return -1;
				}
			}
		else
			return -1;
		return pos;
	}

	public void insert(String target, String LinkedList, String start) {
		int start1 = Integer.parseInt(start);
		getLinkedList(target).addAll(start1, getLinkedList(LinkedList));
	}

	public void delete(String LinkedList, String start, String span) {
		int a = Integer.valueOf(start);
		int b = Integer.valueOf(span);
		System.out.println("a" + a + " b:" + b);
		int length = a + b;
		for (int i = a; i <= length - 1; i++) {
			System.out.println(i);
			getLinkedList(LinkedList).remove(a);
		}
	}

	public void Substring(String target, String LinkedList2, String start, String span) {
		LinkedList<Character> src = getLinkedList(target);
		int tar = Integer.parseInt(start);
		int length = Integer.parseInt(span);
		for (int i = tar; i < (tar + length); i++) {
			char c = getLinkedList(LinkedList2).get(i);
			src.add(c);
		}
	}

	public LinkedList<Character> getLinkedList(String name) {
		char i = name.toLowerCase().charAt(0);
		switch (i) {
		case 'a':
			return a;
		case 'b':
			return b;
		case 'c':
			return c;
		}
		return null;
	}
}
