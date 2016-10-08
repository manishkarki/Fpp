package com.assignment.lesson7;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Rainbow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Rainbow() {
		setTitle("Rainbow color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 750, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 50, 50));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton red = new JButton();
		contentPane.add(red);
		red.setBackground(Color.red);
		red.setBounds(10, 10, 100, 25);
		red.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane.showMessageDialog(contentPane, "Red signifies passion, vitality, enthusiasm and security.");
			}
		});

		JButton orange = new JButton();
		contentPane.add(orange);
		orange.setBackground(Color.ORANGE);
		orange.setBounds(110, 10, 100, 25);
		orange.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane.showMessageDialog(contentPane,
						" It is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control.");
			}
		});

		JButton yellow = new JButton();
		contentPane.add(yellow);
		orange.setBackground(Color.YELLOW);
		yellow.setBounds(210, 10, 100, 25);
		yellow.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane.showMessageDialog(contentPane,
						"  It represents clarity of thought, wisdom, orderliness and energy.");
			}
		});

		JButton green = new JButton();
		contentPane.add(green);
		green.setBackground(Color.green);
		green.setBounds(310, 10, 100, 25);
		green.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane.showMessageDialog(contentPane,
						"  This is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth");
			}
		});

		JButton blue = new JButton();
		contentPane.add(blue);
		blue.setBackground(Color.blue);
		blue.setBounds(410, 10, 100, 25);
		blue.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane.showMessageDialog(contentPane,
						"  The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.");
			}
		});

		JButton indigo = new JButton();
		contentPane.add(indigo);
		indigo.setBackground(Color.GRAY);
		indigo.setBounds(510, 10, 100, 25);
		indigo.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane.showMessageDialog(contentPane,
						" Indigo is mystical as it bridges the Gap between Finite and Infinite. Indigo colored gem stones are often used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition.");
			}
		});

		JButton violet = new JButton();
		contentPane.add(violet);
		violet.setBackground(Color.MAGENTA);
		violet.setBounds(610, 10, 100, 25);
		violet.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane.showMessageDialog(contentPane,
						" It is considered the highest element of spirituality. It can ignite one’s imagination and be an inspiration to artists");
			}
		});

	}

	public static void main(String args[]) {
		Rainbow r = new Rainbow();
		r.setVisible(true);
	}
}
