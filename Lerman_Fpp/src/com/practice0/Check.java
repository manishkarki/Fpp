package com.practice0;


public class Check {

	public void method(int a , int b){
		a *=2;
		b /= 2;
	}
	public static void main(String[] args) {
		Check c = new Check();
		int a = 10, b = 20;
		c.method(a,b);
		System.out.println("a:"+a+" b:"+b);
	}
}
