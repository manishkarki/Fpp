package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Program2_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to find the sequence");
		String input = scan.nextLine();
		scan.close();
		ArrayList<String> list = new ArrayList<String>();
		String sub = null;
		boolean found = false;
		for(int i =1; i<= input.length(); i++){
			for(int j =0; j< input.length() -i+1; j++){
				sub = input.substring(j, j+i);
				for(int k =0; k<list.size(); k++){
					//System.out.println(list.size());
					if(list.get(k).equals(sub)){
						found = true;
						break;
					}
				}
				if(!found){
					list.add(sub);
					System.out.println("["+sub+"]");
				}
			}
		}
	}
}
