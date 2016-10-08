package com.lesson3;

public class Billing {

	public double calculateBill(double price ){
		return price + (0.8*price);
	}
	public double calculateBill(double price, int qty){
		double subTotal = 0;
		subTotal = price*qty;
		return subTotal + (0.8*subTotal);
	}
	public double calculateBill(double price, int qty, int coupon){
		double subTotal =0,subTotal1 =0,total =0,couponPercentage =0;
		subTotal = price*qty;
		couponPercentage = coupon/100;
		subTotal1 =subTotal - couponPercentage*subTotal;
//		System.out.println("sub"+subTotal1);
		total = subTotal1 +(0.8*subTotal1);
		return total;
	}
	public static void main(String[] args) {
		Billing bill = new Billing();
		System.out.println("with single para:"+bill.calculateBill(100));
		System.out.println("with double para:"+bill.calculateBill(100,3));
		System.out.println("with three para:"+bill.calculateBill(100,4,5));
	}
}
