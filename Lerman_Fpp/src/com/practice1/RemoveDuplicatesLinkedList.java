package com.practice1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicatesLinkedList {

	public LinkedList<String> returnUnionWithoutDuplicates(LinkedList<String> a, LinkedList<String> b)
			throws ConcurrentModificationException {
		if(a == null && b!= null)
			return b;
		if(a != null && b == null)
		    return a;
		LinkedList<String> ret = new LinkedList<>();
		LinkedList<String> ret1 = new LinkedList<>();
		Iterator<String> iter = a.iterator();
		while(iter.hasNext()){
			String remove = iter.next();
			if(b.contains(remove)){
				System.out.println(remove);
				ret.add(remove);
			}
		}
		a.removeAll(ret);
		/*int size = a.size();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < a.size(); j++) {
				String check = a.get(j);
				if (b.contains(check)) {
					a.remove(check);
				}
			}
		}*/
		ret1 = a;
		ret1.addAll(b);
		return ret1;
	}

	public static void main(String[] args) {
		RemoveDuplicatesLinkedList rmdll = new RemoveDuplicatesLinkedList();
		LinkedList<String> a = new LinkedList<>(
				Arrays.asList("Manish", "Nilam", "Gyanendra", "Asutosh", "Bimesh", "Prajil"));
		LinkedList<String> b = new LinkedList<>(
				Arrays.asList("Bimesh", "Aakash", "Prajil", "Bidur", "Manish", "Nilam"));
		LinkedList<String> c = rmdll.returnUnionWithoutDuplicates(a, b);
		System.out.println(c);

	}
}
