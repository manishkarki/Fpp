package com.lesson7;

public class SingleThreadedSingleton {

	private static SingleThreadedSingleton instance;
	private SingleThreadedSingleton() {
		System.out.println("called once");
	}
	
	public static SingleThreadedSingleton getInstance() {
		if(instance == null) {
			instance = new SingleThreadedSingleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
//		SingleThreadedSingleton s = new SingleThreadedSingleton();
		SingleThreadedSingleton singleton1 = SingleThreadedSingleton.getInstance();
		SingleThreadedSingleton singleton2 = SingleThreadedSingleton.getInstance();
	}

}