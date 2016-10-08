package com.lesson3;

public class Main {
	public static void main(String[] args) {
		PairOfDice pair1 = new PairOfDice();
		PairOfDice pair2 = new PairOfDice();
		int times =0;
		do{
			pair1.roll();
			pair2.roll();
			System.out.println("pair1 come up with total:"+pair1.sum());
			System.out.println("pair2 come up with total:"+pair2.sum());
			times++;
		}while(pair1.sum() != pair2.sum());
		System.out.printf("It took %d times to reach the same value",times);
	}
}
