package com.assignment.day3;

import java.util.Date;
import java.util.GregorianCalendar;

import com.assignment.day3.Account;

public class Employee {

	private Account savings;
	private Account checking;
	private Account retirement;
	private String name;
	private Date hireDate;
	
	public Date getHireDate() {
		return hireDate;
	}

	public Employee(String name, int yearOfHire, 
int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = 
new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		checking= new Account(this, AccountType.CHECKING, startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		savings = new Account(this, AccountType.SAVINGS, startAmount);
		
	}
	public void createNewRetirement(double startAmount) {
		retirement = new Account(this, AccountType.RETIREMENT, startAmount);
		
	}

	public String getName() {
		return name;
	}

	public void deposit(AccountType acctType, double amt){
		if(acctType.equals(AccountType.SAVINGS))
			savings.makeDeposit(amt);
		else if(acctType.equals(AccountType.CHECKING))
			checking.makeDeposit(amt);
		else
			retirement.makeDeposit(amt);
	}
	public boolean withdraw(AccountType acctType, double amt){
		if(acctType.equals(AccountType.SAVINGS) && (savings.getBalance() > amt))
			return true;
		else if(acctType.equals(AccountType.CHECKING) &&(checking.getBalance() > amt))
			checking.makeDeposit(amt);
		else if(acctType.equals(AccountType.RETIREMENT) && (retirement.getBalance() > amt))
			return true;
		return false;
	}

	public String getFormattedAcctInfo() {
		String pass = "";
		if(checking == null)
			pass += savings.toString()+"\n"+retirement.toString();
		else if(savings == null)
			pass += checking.toString() +"\n" + retirement.toString();
		else if(retirement == null)
			pass += checking.toString() +"\n" + savings.toString();
		else
			pass += savings.toString()+checking.toString()+retirement.toString();
		return pass;
	}

}

