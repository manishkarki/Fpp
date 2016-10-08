package com.assignment.lesson11;

public class MainHashClass {

	public static void main(String[] args) {
		MyHashTable mht = new MyHashTable();
		mht.put("Manish Karki", "641-451-3494");
		mht.put("Bill Johns", "641-451-3495");
		System.out.println("----------------My Hash Table----------------------");
		System.out.println(mht.get("Manish Karki"));
		System.out.println(mht);
		System.out.println("Number of elements in the hash table : "+mht.countElements());
		System.out.println("Number of elements in the longest LinkedList chain : "+mht.longestChainElements());
		System.out.println("The number of array cells that are still empty : "+mht.emptyCell());
	}

}
