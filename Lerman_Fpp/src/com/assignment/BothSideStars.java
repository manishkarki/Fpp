package com.assignment;

import java.util.Scanner;

public class BothSideStars {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter maxm odd number of stars to be printed");
		int input = scan.nextInt();
		if (input % 2 == 0) {
			System.out.println("Incorrect input, please enter an odd input");
		} else {
			int k=-1;
			for (int i = 0; i < input; i++) {
				k++;
				if(i%2!=0)
					k--;
//				System.out.println("K:"+k+" i:"+i);
				for(int j= 0; j<= (input-1); j++){
					if(i %2 !=0){
						System.out.print("");
					}
					else if(i == (input -1) || j == (input/2-k) || j == (input/2+k) )
						System.out.print("*");
					
					else{
						System.out.print(" ");
					}
					
				}
				System.out.println("");
			}
		}
	}

}
