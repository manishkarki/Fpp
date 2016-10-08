package com.lesson3;

public class PairOfDice {

	public int die1; // Number showing on the first die.
	public int die2; // Number showing on the second die.

	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values. Call the roll() method to roll the dice.
		roll();
	}

	public PairOfDice(int val1, int val2) {
		this.die1 = val1;// Constructor. Creates a pair of dice that
		this.die2 = val2; // are initially showing the values val1 and val2.
	}

	public void roll() {
		this.die1 = (int) Math.floor(Math.random() * (7- 1));// Roll the dice by setting each of the dice (die1,
		this.die2 = (int)Math.floor( Math.random()* (7-1));	  // die2) to be a random number between 1 and 6.
	}
	
	public int sum(){
		return this.die1 + this.die2;
	}
}
