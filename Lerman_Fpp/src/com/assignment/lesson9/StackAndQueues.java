package com.assignment.lesson9;

import java.util.LinkedList;
import java.util.Scanner;

public class StackAndQueues {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> a = new LinkedList<Integer>();
		int input =0;
		System.out.println("Enter numbers and -1 to terminate");
		do{
			input = scan.nextInt();
			a.add(input);
		}while(input >=0);// negative number terminates further loop
		a.removeLast();
		int length = a.size();
		for(int i =0; i< length; i++){
			if(i == length-1)
				System.out.print("and ");
			System.out.print(a.peekLast()+" ");//peekLast gives LIFO
			a.removeLast();
		}
		/*for(int i =0; i< length; i++){
			if(i == length-1)
				System.out.print("and ");
			System.out.print(a.getLast()+" ");
			a.removeLast();
		}*/
	}
}
