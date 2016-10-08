package com.practice0;

public class StarNumbers {

	public static void main(String[] args) {
		for(int i =0; i<4; i++){
			int k =1000;
			k += 1000*i;
			for(int j =0; j<=i; j++){
					System.out.print(k);
					System.out.print(" ");
				k +=50;
			}
			System.out.println("");
		}
	}
}
