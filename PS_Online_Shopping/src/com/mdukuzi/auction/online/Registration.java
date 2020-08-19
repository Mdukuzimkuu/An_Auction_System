package com.mdukuzi.auction.online;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Registration {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(240, 255, 255), new Color(255, 228, 196), new Color(211, 211, 211), null));
		panel.setBounds(89, 32, 462, 418);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(37, 33, 340, 374);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Bidder", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(10, 26, 106, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(151, 26, 133, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 57, 106, 20);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 57, 133, 22);
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 98, 106, 20);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblUsername);
		
		textField_2 = new JTextField();
		textField_2.setBounds(151, 98, 133, 22);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Gender:");
		lblNewLabel_4_1.setBounds(10, 235, 106, 20);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_4_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(147, 232, 55, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_4 = new JLabel("Contacts:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 285, 106, 20);
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(151, 285, 133, 22);
		panel_1.add(textField_4);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(206, 232, 78, 23);
		panel_1.add(rdbtnFemale);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setToolTipText("");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(10, 129, 106, 20);
		panel_1.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmPassword.setBounds(10, 155, 123, 20);
		panel_1.add(lblConfirmPassword);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(208, 312, 89, 23);
		panel_1.add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(151, 131, 133, 20);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(151, 157, 133, 20);
		panel_1.add(passwordField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(151, 202, 133, 22);
		panel_1.add(textField_3);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(10, 202, 106, 20);
		panel_1.add(lblEmail);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Seller", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(25, 26, 106, 20);
		panel_2.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(166, 26, 133, 22);
		panel_2.add(textField_5);
		
		JLabel lblLastName_1 = new JLabel("Last Name:");
		lblLastName_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastName_1.setBounds(25, 57, 106, 20);
		panel_2.add(lblLastName_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(166, 57, 133, 22);
		panel_2.add(textField_6);
		
		JLabel lblUsername_1 = new JLabel("Username:");
		lblUsername_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername_1.setBounds(25, 98, 106, 20);
		panel_2.add(lblUsername_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(166, 98, 133, 22);
		panel_2.add(textField_7);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setToolTipText("");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword_1.setBounds(25, 129, 106, 20);
		panel_2.add(lblPassword_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(166, 131, 133, 20);
		panel_2.add(passwordField_2);
		
		JLabel lblConfirmPassword_1 = new JLabel("Confirm Password:");
		lblConfirmPassword_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmPassword_1.setBounds(25, 155, 123, 20);
		panel_2.add(lblConfirmPassword_1);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(166, 157, 133, 20);
		panel_2.add(passwordField_3);
		
		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail_1.setBounds(25, 202, 106, 20);
		panel_2.add(lblEmail_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(166, 202, 133, 22);
		panel_2.add(textField_8);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Gender:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(25, 235, 106, 20);
		panel_2.add(lblNewLabel_4_1_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setBounds(162, 232, 55, 23);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnFemale_1 = new JRadioButton("Female");
		rdbtnFemale_1.setBounds(221, 232, 78, 23);
		panel_2.add(rdbtnFemale_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Contacts:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(25, 285, 106, 20);
		panel_2.add(lblNewLabel_4_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(166, 285, 133, 22);
		panel_2.add(textField_9);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.setBounds(223, 312, 89, 23);
		panel_2.add(btnSubmit_1);
		
		JLabel lblRegistrationForm = new JLabel("Registration Form");
		lblRegistrationForm.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRegistrationForm.setBounds(69, 11, 262, 22);
		panel.add(lblRegistrationForm);
	}
}
