package com.week1.lesson5;

import java.util.Scanner;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Professor []pro = new Professor[3];
		Secretary [] sec = new Secretary[3];
		pro[0] = new Professor("Manish", 20000, 2010, 12, 1, 11, 45, 01, 10);
		pro[1] = new Professor("Gyanen", 10000, 2011, 2, 1, 11, 45, 01, 10);
		pro[2] = new Professor("Bluam", 5000, 2011, 13, 1, 11, 45, 01, 10);
		sec[0] = new Secretary("Asu", 3000, 2008, 12, 10, 1, 45, 00, 200);
		sec[1] = new Secretary("Praj", 3100, 2007, 12, 10, 1, 45, 00, 200);
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = pro[0];// populating department with created instances of secretary and pro
		department[1] = pro[1];
		department[2] = pro[2];
		department[3] = sec[0];
		department[4] = sec[1];
		double totalSalary =0;
		Scanner scan = new Scanner(System.in);
		//display of total salary according to user response
		System.out.println("Hi,will you like to Know the sum of all salaries in the department, click 'y' to know");
		String response = scan.next();
		if(response.equalsIgnoreCase("y"))
			//display total salary
			for(DeptEmployee dept: department){
				totalSalary += dept.computeSalary();
				System.out.println("Salary total value is:"+ totalSalary);
			}
		else //just a message
			System.out.println("ok!! Bye");
		System.out.println("wanna know employee details? Press Y to know");
		String responseEmpDetails = scan.next();
		if(responseEmpDetails.equalsIgnoreCase("y")){
			System.out.println("Enter the name of employee you wanna get details of::");
			scan.nextLine();
			String name = scan.nextLine();
			for(DeptEmployee emp: department){
				if(emp.getName().equalsIgnoreCase(name))
					System.out.println(emp.getName()+"\t"+emp.getHireDay());
			}
		}
	}
}
