package com.assignment.lesson9;

import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueUserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check:");
		String check = scan.nextLine();
		int index = check.indexOf(':');
		ArrayDeque<Character> queue = new ArrayDeque<Character>();
		// System.out.println("index"+i);
		if (index < 0) {
			System.out.println("N:  No colon on the line.");
			return;
		} else {
			for (int i = 0; i < index; i++) {
				queue.add(check.charAt(i));
			}
			int qLength = queue.size();
			String right = check.substring(index + 1, check.length());
			int rightLength = right.length();
			if (qLength > rightLength) {
				System.out.println("L:  The left part (before the colon) is longer than the right");
			} else if (qLength < rightLength) {
				System.out.println("L:  The Right part (after the colon) is longer than the left");
			} else {
				boolean equal = true;
				for (int i = 0; i < qLength; i++) {
					char lCheck = queue.getFirst();
					queue.removeFirst();
					char rCheck = right.charAt(i);
					if (lCheck != rCheck) {
						equal = false;
						break;
					}
				}
				if (!equal)
					System.out.println("D :The left and right parts have the same length but are different.");
				else
					System.out.println("S : the left and right parts are exactly same");
			}
		}
	}
}
