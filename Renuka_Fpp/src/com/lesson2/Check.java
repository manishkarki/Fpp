package com.lesson2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Check {
	public float calculateBill(float price ){
		return (float)(0.8*price);
	}
	public static void main(String[] args) {
		Check ch = new Check();
	    Calendar cal = new GregorianCalendar(1999, 1, 1);
	    Calendar now = new GregorianCalendar();
	    int res = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
	    System.out.println("res:"+res);
	    if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
	        || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) && cal.get(Calendar.DAY_OF_MONTH) > now
	            .get(Calendar.DAY_OF_MONTH))) {
	      res--;
	    }
	    System.out.println(res);
	    System.out.println(""+ ch.calculateBill(400));
	}
}
