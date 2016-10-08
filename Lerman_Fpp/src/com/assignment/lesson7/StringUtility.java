package com.assignment.lesson7;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringUtility extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton countLetters,reverseLetters,removeDuplicates;
	private JLabel input1, output1;
	private JTextField input,output;
	public StringUtility(){
		setTitle("String Utility");
		setSize(550, 350);
		setLocation(100, 100);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		countLetters = new JButton("Count Letters");
		countLetters.setBounds(30,20,150,30);
		reverseLetters = new JButton("Reverse Letters");
		reverseLetters.setBounds(30,80,150,30);
		removeDuplicates = new JButton("Remove duplicates");
		removeDuplicates.setBounds(30,140,150,30);
		input1 = new JLabel("input");
		input1.setBounds(190, 50, 30, 20);
		output1 = new JLabel("output");
		output1.setBounds(190, 110, 40, 20);
		input = new JTextField();
		input.setBounds(190, 70, 110, 30);
		output = new JTextField();
		output.setBounds(190, 135, 110, 30);
		contentPane.add(countLetters);
		contentPane.add(reverseLetters);
		contentPane.add(removeDuplicates);
		contentPane.add(input);
		contentPane.add(output);
		contentPane.add(input1);
		contentPane.add(output1);
		countLetters.addActionListener(this);
		removeDuplicates.addActionListener(this);
		reverseLetters.addActionListener(this);
	}
	public static void main(String[] args) {
		StringUtility su = new StringUtility();
		su.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			JButton clickedEvent = (JButton) e.getSource();
			if(clickedEvent.equals(countLetters)){
				String s = input.getText();
				
				output.setText(""+s.length());
			}
			if(clickedEvent.equals(reverseLetters)){
				String s = input.getText();
				String ret = "";
				for(int i =s.length()-1; i>=0;i--){
					ret += s.charAt(i);
				}
				output.setText(ret);
			}
			if(clickedEvent.equals(removeDuplicates)){
				String s = input.getText();
				String ret = "";
				boolean found = false;
				for(int i =0; i<s.length(); i++){
					for(int j =0;j<i;j++){
						if(s.charAt(i)==s.charAt(j))
							found = true;
					}
					if(!found){
						ret += s.charAt(i);
						output.setText(ret);
					}
				}
			}
		}
		
	}
}
