package com.lesson3;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	public SavingsAccount(double balance,double rate){
		this.savingsBalance = balance;
		annualInterestRate = rate;
	}
	private double calculateMonthlyInterest(){
		double monthlyInterest = (this.savingsBalance*annualInterestRate)/1200;
		savingsBalance +=monthlyInterest;
		return monthlyInterest;
	}
	private void modifyInterestRate(double rate){
		annualInterestRate = rate;
	}
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00,4);
		SavingsAccount saver2 = new SavingsAccount(3000.00,4);
		for(int i =0; i<12; i++){
			System.out.println("Interest for saver1 for month"+ (i+1)+" "+String.format("%.2f", saver1.calculateMonthlyInterest()));
			System.out.println("Interest for saver2 for month"+ (i+1)+" "+String.format("%.2f",saver2.calculateMonthlyInterest()));
		}
		saver1.modifyInterestRate(5);
		System.out.println("annualInterestRate is now"+annualInterestRate);
	}
}
