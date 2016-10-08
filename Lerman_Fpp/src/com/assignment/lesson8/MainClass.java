package com.assignment.lesson8;

import java.util.Scanner;

public class MainClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DynamicStringRoutines dsr = new DynamicStringRoutines();
		char check = 0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Enter a command:1)R to read String,2)C: to concatenate,3)W to write\n 4)E to check equality 5)L to find length & 6)Q to quit/");
			System.out.println("Enter a command:");
			char c = scan.nextLine().toLowerCase().charAt(0);
			check = c;
			switch (c) {
			case 'r':
				System.out.println("Enter String name->");
				String name = scan.nextLine();
				System.out.println("Enter text ->");
				String text = scan.nextLine();
				dsr.readstring(name, text);
				break;
			case 'w':
				System.out.println("Enter String name->");
				String name1 = scan.nextLine();
				dsr.writeString(name1);
				break;
			case 'c':
				System.out.println("Enter target name->");
				String target = scan.nextLine();
				System.out.println("Enter String name->");
				String name2 = scan.nextLine();
				dsr.concatenateString(target, name2);
				break;
			case 'e':
				System.out.println("Enter first string ->");
				String targ1 = scan.nextLine();
				System.out.println("Enter second string ->");
				String targ2 = scan.nextLine();
				System.out.println(dsr.equals(targ1, targ2));;
				break;
			case 'l':
				System.out.println("Enter the string:");
				String len = scan.nextLine();
				int length = dsr.findLength(len);
				System.out.print("Length of "+ len +" is "+length);
				break;
			case 'd':
				System.out.println("Enter String name");
				String rem = scan.nextLine();
				dsr.clear(rem);
				break;
			case 's':
				System.out.println("Enter target name:");
				String targ = scan.nextLine();
				System.out.println("Enter String to be searched:");
				String search = scan.nextLine();
				System.out.println("Enter starting index to search:");
				String start = scan.nextLine();
				System.out.print("");
				System.out.println(dsr.search(search, targ, start));;
				break;
			case 'i':
				System.out.println("Enter target name:");
				String target1 = scan.nextLine();
				System.out.println("Enter String to be searched:");
				String LinkedList = scan.nextLine();
				System.out.println("Enter starting index to search:");
				String start1 = scan.nextLine();
				System.out.print("");
				dsr.insert(target1, LinkedList,start1);;
				break;
			case 'f':
				System.out.println("enter a strig name: ");
				String s = scan.nextLine();
				System.out.println("Enter starting pos:");
				String startPos = scan.nextLine();
				System.out.println("Enter span");
				String span = scan.nextLine();
				dsr.delete(s, startPos, span);
				break;
			case 'q':
				System.out.println(".....Bye......");
				System.exit(0);
			}
		}while (check != 'q') ;
	}

}
