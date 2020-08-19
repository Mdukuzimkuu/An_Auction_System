package com.mdukuzi.auction.online;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class Splash_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash_page frame = new Splash_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Splash_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(450, 200, 500, 400);
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(152, 5, 343, 390);
		lblNewLabel.setForeground(new Color(240, 248, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/tenor.gif"));
		contentPane.setLayout(null);
		lblNewLabel.setIcon(icon);
		contentPane.add(lblNewLabel);
	}
}
