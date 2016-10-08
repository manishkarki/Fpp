package com.lesson2;


public class MinimumString {
	public static char findMinChar(String x, int z){
	    char min = '~';
	    if(z < x.length()){
	        if(x.charAt(z) < min){
	        	System.out.println("x is:"+min);
	            min = x.charAt(z);
	        }
	        char min2 = findMinChar(x, z+1); // add assignment
	        if (min2 < min) 
	        	min = min2; 
	    }
	    return min;
	}
	public static void main(String[] args) {
		System.out.println("min "+findMinChar("beli", 0));
	}
}
