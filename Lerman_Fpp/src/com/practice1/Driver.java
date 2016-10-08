package com.practice1;

import java.util.PriorityQueue;

class Driver{
	
	public static void main(String[] args) {
		Student s = new Student(2,"bimesh");
		Student s1 = new Student(2,"bimesh");
		Student s2 = new Student(1,"Manish Dai");
		PriorityQueue<Student> queue = new PriorityQueue<>();
		queue.add(s1);
		queue.add(s);
		queue.add(s2);
		System.out.println(s);
		System.out.println(s.compareTo(s1.getId()));
		System.out.println(s.compare(s.getName(), s1.getName()));
		System.out.println();
		
	}
}