package com.assignment;

public class AreaAndDiagonal {
	public static double area(float r) {
		double A = Math.PI * r * r;
		return A;
	}

	public static double diagonal(double len, double wid) {
		double diag = Math.sqrt((len * len) + (wid * wid));
		return diag;
	}

	public static void main(String[] args) {
		
		System.out.println("area of circle::"+ area(3));
		System.out.println("diagonal of rectangle::"+ diagonal(3, 4));
	}

}
