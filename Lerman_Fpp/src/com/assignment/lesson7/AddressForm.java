package com.assignment.lesson7;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddressForm extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton submitButton;
	private JLabel name, state, zip;
	private JLabel street;
	private JLabel city;
	private JTextField nameText, streetText, cityText, stateText, zipText;

	AddressForm() {
		setTitle("Address Form");
		setSize(650, 500);
		setLocation(100, 100);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		name = new JLabel("Name");
		name.setBounds(55, 20, 70, 30);
		nameText = new JTextField();
		nameText.setBounds(45, 40, 170, 30);
		street = new JLabel("Street");
		street.setBounds(225, 20, 70, 30);
		streetText = new JTextField();
		streetText.setBounds(215, 40, 170, 30);
		city = new JLabel("City");
		city.setBounds(410, 20, 70, 30);
		cityText = new JTextField();
		cityText.setBounds(385, 40, 170, 30);
		state = new JLabel("State");
		state.setBounds(105, 95, 70, 30);
		stateText = new JTextField();
		stateText.setBounds(90, 120, 120, 30);

		zip = new JLabel("Zip");
		zip.setBounds(265, 95, 70, 30);
		zipText = new JTextField();
		zipText.setBounds(240, 120, 120, 30);

		submitButton = new JButton("Submit");
		submitButton.setBounds(250, 325, 100, 50);
		contentPane.add(name);
		contentPane.add(nameText);
		contentPane.add(street);
		contentPane.add(streetText);
		contentPane.add(city);
		contentPane.add(cityText);
		contentPane.add(state);
		contentPane.add(stateText);
		contentPane.add(zip);
		contentPane.add(zipText);
		contentPane.add(submitButton);
		submitButton.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		AddressForm af = new AddressForm();
		af.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			System.out.print("Name::" + nameText.getText() + "\t" + "city:"+ "\t" + cityText.getText() + "\n" + "street:"
					+ streetText.getText() + "\t" + "state:" + stateText.getText() + "\t" + "zip:" + zipText.getText());
		}
	}

}
