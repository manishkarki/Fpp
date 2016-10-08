package com.assignment.lesson12;

import javax.swing.JOptionPane;

public class LicenseMatcher {

	public static final String VALID_LICENSE_PLATE_NUMBER="[a-zA-Z]{2}-[0-9]{4}-[a-zA-Z]{3}";
	public static void main(String[] args) {
		 
			String str1;
			while(true)
			{
				str1=JOptionPane.showInputDialog(null,"License Plate Number");
				if(str1.equalsIgnoreCase("STOP"))
					break;
				if(str1.matches(VALID_LICENSE_PLATE_NUMBER))
					JOptionPane.showMessageDialog(null,str1+" is Valid");
				else
					JOptionPane.showMessageDialog(null,str1+" is Invalid");
			}
	}

}
