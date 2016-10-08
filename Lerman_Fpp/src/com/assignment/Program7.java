package com.assignment;

import java.util.Scanner;

public class Program7 {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("table name = ");
		String tablename = sc.nextLine();
		System.out.print("number of column names = ");
		int cols = Integer.parseInt(sc.nextLine());
		String colsname = "";

		for (int i = 0; i < cols; i++) {
			System.out.print("column Name = ");
			colsname = colsname + ", " + sc.nextLine();
		}
		System.out.print("Salary Value = ");
		float salaryvalue = sc.nextFloat();
		/*System.out.println("cols name"+ colsname.length());
		System.out.println(colsname);*/
		System.out.println("SELECT " + colsname.substring(1, colsname.length()) + "\n" + "FROM " + tablename + "\n"
				+ "WHERE Salary>" + salaryvalue);

	}
}
