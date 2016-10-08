package com.assignment.lesson11;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class MyHashTable {
	private static final int INITIAL_SIZE;
	static {
		INITIAL_SIZE = 19;
	}
	private int tableSize;
	private LinkedList[] table;

	public MyHashTable() {
		this(INITIAL_SIZE);
	}

	public MyHashTable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
	} // an array of LinkedList objects.

	@SuppressWarnings("unchecked")
	public void put(String key, String value) {
		// disallow null keys
		if (key == null)
			return;

		// get the "big" integer corresponding to the object
		// assumes key is not null
		if (checkduplicate(key))
			return;
		int hashcode = key.hashCode();

		// compress down to a table slot
		int hash = Math.abs(hashM(hashcode));

		// put the value and the key into an Entry object
		// which will be placed in the table in the
		// slot ( namely, hash)

		// allows a null value
		Entry e = new Entry(key, value);

		// now place it in the table
		if (table[hash] == null) {
			table[hash] = new LinkedList();
		}
		// this allows duplicate keys
		table[hash].add(e);
	}

	private boolean checkduplicate(String key) {
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				Iterator it = table[i].iterator();// For the LinkedList at
													// table[i]
				Entry next = null;
				while (it.hasNext()) {
					next = (Entry) it.next();
					if (next.key.equals(key)) {
						System.out.println("duplicate key :" + key);
						return true;
					}
				}
			}
		}
		return false;
	}

	public String get(String key) {
		// null key not allowed
		if (key == null)
			return null;
		// get the "big" integer corresponding to the object
		int hashcode = key.hashCode();

		// compress down to a table slot
		int hash = Math.abs(hashM(hashcode));

		// now look for the desired Entry
		Entry e = null;

		// First we should make sure that table[hash]
		// is Not null. If it is null, then the
		// Entry is Not there. (JL 11-2009).

		Iterator it = table[hash].iterator();
		while (it.hasNext()) {
			e = (Entry) it.next();
			if (e.key.equals(key)) {
				return e.value;
			}
		}
		return null; // Not found.

	}

	public String toString() {
		// String n = System.getProperty("line.separator");// a new line
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < table.length; ++i) {
			if (table[i] != null) {
				Iterator it = table[i].iterator();// For the
				// LinkedList at table[i]

				Entry next = null;
				while (it.hasNext()) {
					next = (Entry) it.next();
					sb.append(next);
				}
			}
		}
		return sb.toString();
	}

	// In the java file this method might be called hash
	private int hashM(int bigNum) {
		return bigNum % tableSize;
	}

	private class Entry {
		private String key;
		private String value;

		Entry(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String toString() {
			return key.toString() + "->" + value.toString();
		}

	}

	public int countElements() {
		int count = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null)
				count += table[i].size();
		}
		return count;
	}

	public int longestChainElements() {
		int max = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				if (table[i].size() > max) {
					System.out.println("::" + table[i].size());
					max = table[i].size();
				}
			}
		}
		return max;
	}

	public int emptyCell() {
		int emptyCount = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] == null)
				emptyCount++;
		}
		return emptyCount;
	}
}
