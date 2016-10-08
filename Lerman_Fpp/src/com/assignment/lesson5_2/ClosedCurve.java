package com.assignment.lesson5_2;

public class ClosedCurve {
	static int num1=0,num2=1,num3=0;    
	 static void fibonacci(int num){ 
//		 System.out.print("count::"+num);
	    if(num>0){    
	         num3 = num1 + num2;    
	         num1 = num2;    
	         num2 = num3;    
	         System.out.print(" "+num3);   
	         fibonacci(num-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  int num=10;    
	  System.out.print(num1+" "+num2);//printing 0 and 1    
	  fibonacci(num-2);//n-2 because 2 numbers are already printed   
	 }  
}
