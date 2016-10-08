package com.assignment.lesson9;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DelimitersMiss {

	private static ArrayDeque<Character> stack = new ArrayDeque<Character>();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		boolean result = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the expression ->");
		String exp = sc.nextLine();
		for (int i = 0; i < exp.length(); i++) {
			result = checkExpression(exp.charAt(i));
			if (!result) {

				break;
			}
		}
		if (stack.size() != 0 || !result) { //if something remains after checking expn or result is false

			System.out.println("Mismatch Experission (:");
			result = false;
		}
		if (result) {
			System.out.println("Correct Expression, :)");
		}
	}

	public static boolean checkExpression(char ch) {
		boolean flag = true;

		switch (ch) {
		case '(':
			stack.push(ch);
			break;
		case ')':				//
			if (stack.isEmpty()) {
				System.out.println("Stack is empty");
				flag = false;
			} else {
				if (stack.pop() != '(') {
					flag = false;
				}
			}

			break;
		case '{':
			stack.push(ch);
			break;
		case '}':
			if (stack.isEmpty()) {
				System.out.println("Stack is empty");
				flag = false;
			} else {
				if (stack.pop() != '{') {

					flag = false;
				}
			}
			break;
		case '[':
			stack.push(ch);
			break;
		case ']':
			if (stack.isEmpty()) {
				System.out.println("Stack is empty");
				flag = false;
			} else {
				if (stack.pop() != '[') {
					flag = false;
				}
			}
			break;
		default:
			break;
		}
		return flag;
	}

}
