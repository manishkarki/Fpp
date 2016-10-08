package com.assignment.lesson12;

import java.util.regex.*;

import javax.swing.JOptionPane; 

public class EmailValidation {
	
	/* which include  a-z A-Z 0-9 . _ character only followed by
	@ followed by a-z A-Z followed by a-z A-Z character at least 2 and not more than 3*/
	
	public static final String EMAIL_VALIDATOR="^[(a-zA-Z-0-9-\\_\\+\\.)]{6,25}+@[(a-zA-Z)]+\\.[(a-zA-Z)]{2,3}"; 

	public static void main(String[] args) {
		 
		String str1;
		Matcher matcher;
		Pattern pattern=Pattern.compile(EMAIL_VALIDATOR);
		while(true)
		{
			str1=JOptionPane.showInputDialog("Enter email address");
			matcher=pattern.matcher(str1);
			if(str1.equalsIgnoreCase("STOP"))
				break;
			if(matcher.matches())
				JOptionPane.showMessageDialog(null, str1+ " "+"is valid email");
			else
				JOptionPane.showMessageDialog(null, str1+ " "+"is Invalid email");
		}
	}

}
