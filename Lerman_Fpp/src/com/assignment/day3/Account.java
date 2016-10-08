package com.assignment.day3;

public class Account {

	/*public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";*/
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	@SuppressWarnings("unused")
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		this.balance +=deposit;
		System.out.println("new balance is"+ balance);
	}

	public boolean makeWithdrawal(double amount) {
		if(this.balance > amount){
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	public double computeInterest(){
		double interest = 0;
		if(this.getAcctType().equals(AccountType.CHECKING))
			interest = this.getBalance() * 0.02;
		else if(this.getAcctType().equals(AccountType.SAVINGS))
			interest = this.getBalance() * 0.04;
		else
			interest = this.getBalance() *0.05;
		
		return interest;
	}
	

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
}
