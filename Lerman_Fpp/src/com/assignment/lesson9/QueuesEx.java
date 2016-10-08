package com.assignment.lesson9;

import java.util.ArrayDeque;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class QueuesEx {
	private static ArrayDeque<Integer> stack0 = new ArrayDeque<Integer>();
	private static ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	private static ArrayDeque<Integer> stack1 = new ArrayDeque<Integer>();

	public static void main(String[] args) {
		int i = 0;
		while (i <= 20) {
			i++;
			stack0.add(i);
		}
		moveFromStackIntoQueue(stack0);
		System.out.print("Queue has ");
		for(int j:queue){
			System.out.print(" "+j);
		}
		moveFromQueueIntoStack(queue);
		System.out.println("Now in Stack:");
		for(int j: stack0){
			System.out.print(" "+j);
		}
		emptyOneStackToAnother(stack0);
		System.out.println("Now in Stack0:");
		for(int j: stack0){
			System.out.print(" "+j);
		}
		System.out.println("Now in Stack1:");
		for(int j: stack1){
			System.out.print(" "+j);
		}
	}

	public static void moveFromStackIntoQueue(ArrayDeque<Integer> stack0) {
		Iterator iter = stack0.iterator();
		while (iter.hasNext()) {
			queue.add((Integer) iter.next());
		}
	}

	public static void moveFromQueueIntoStack(ArrayDeque<Integer> queue) {
		stack0.clear();
		Iterator iter = queue.iterator();
		while (iter.hasNext())
			stack0.push((Integer) iter.next());
	}

	public static void emptyOneStackToAnother(ArrayDeque<Integer> stack0) {
		Iterator iter = stack0.iterator();
		ArrayDeque<Integer> stackTemp = new ArrayDeque<Integer>();
		while (iter.hasNext()){
			stackTemp.push((Integer)iter.next());
		}
		Iterator iter2 = stackTemp.iterator();
		while(iter2.hasNext())
			stack1.push((Integer) iter2.next());
	}
}
