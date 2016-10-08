package com.practice0;

public class OnlyOdd {

	public int[] returnOnlyOdd(int[] a) {
		int index = 0;
		
		for (int i = 0; i < a.length; i++) { //finds the length of the array to be returned 
			if (a[i] % 2 == 1 || -a[i]%2==1) {
				index++;
			}
		}
		System.out.println("Index:"+index);
		int[] b = new int[index];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1 || -a[i]%2==1) {
				b[count] = a[i];             //inserts odd values into the returning array
				count ++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		OnlyOdd oo = new OnlyOdd();
		int [] b = oo.returnOnlyOdd(new int[]{12,13,-5,-8,15,7});
		for(int i =0; i<b.length; i++){
			System.out.print(b[i]+",");
		}
	}
}
