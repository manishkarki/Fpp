package com.assignment.day3.part3;

import java.util.Scanner;

public class MyStringList {
	    Scanner scan = new Scanner(System.in);
	    String [] strArray = new String [2];
	    int size = 0;
	    MyStringList(){
	       
	    }
	    public void add(String s) {
	        if(size == strArray.length)
	            resize();
	        strArray[size ++] = s;
	    }
	    public String get(int i) {
	        if(i < 0 || i> strArray.length)
	            return null;
	        return strArray[i];
	    }
	    public boolean find(String s){
	        for(int i =0; i<strArray.length;i++){
	            if(strArray[i].equalsIgnoreCase(s))
	                return true;
	        }
	        return false;
	    }
	    public boolean remove(String s){
	        String [] temp = new String [strArray.length];
	        int index = -1;
	        if(strArray.length==0)
	            return false;
	        for(int i =0; i<strArray.length; i++){
	            if(strArray[i].equalsIgnoreCase(s)){
	                index = i;
	                break;
	            }
	        }
	        System.arraycopy(strArray, 0, temp, 0, index);
	        System.arraycopy(strArray, index+1, temp, index, strArray.length-(index+1));
	        --size;
	        return true;
	    }
	    public String toString(){
	        StringBuilder pass = new StringBuilder();
	        pass.append("[");
	        for(int i =0; i<strArray.length - 1; i++){
	            pass.append(strArray[i] + ",") ;
	        }
	        pass.append(strArray[strArray.length-1]+"]");
	        return pass.toString();
	    }
	    public int size() {
	        return strArray.length;
	    }
	    private void resize(){
	        System.out.println("Resizing...");
	        String [] tempArray = new String[strArray.length *2];
	        System.arraycopy(strArray, 0, tempArray, 0, strArray.length);
	        strArray = tempArray;
	    }
	   
	    public static void main(String[] args) {
	        MyStringList l = new MyStringList();
	        l.add("Bob");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.add("Steven");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.add("Mark");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.add("Manish");
	        System.out.println("The list of size " + l.size() + " is " + l);
	    }

}
