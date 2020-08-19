package Restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class Restaurants {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
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
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 66, 499, 275);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chicken Burger");
		lblNewLabel.setBounds(29, 34, 246, 27);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1.setBounds(29, 82, 246, 27);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cheese Burger");
		lblNewLabel_2.setBounds(29, 133, 246, 27);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(292, 35, 195, 27);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(292, 83, 195, 27);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(292, 134, 195, 27);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(293, 292, 195, 27);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(293, 343, 195, 27);
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(29, 184, 79, 27);
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblDrink);
		
		JLabel lblDrink_1 = new JLabel("Quantity");
		lblDrink_1.setBounds(292, 184, 115, 27);
		lblDrink_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblDrink_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Cofee", "Ice Tea", "Ice cofee", "Orange"}));
		comboBox.setBounds(29, 211, 172, 20);
		panel.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(292, 222, 195, 27);
		panel.add(textField_4);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 25));
		chckbxHomeDelivery.setBounds(29, 238, 226, 23);
		panel.add(chckbxHomeDelivery);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(504, 66, 434, 275);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Chicken Burger");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(12, 45, 246, 27);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(12, 93, 246, 27);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cheese Burger");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_2.setBounds(12, 202, 246, 302);
		panel_1.add(lblNewLabel_2_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(275, 46, 149, 27);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(275, 94, 149, 27);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(275, 145, 149, 27);
		panel_1.add(textField_12);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 341, 499, 163);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Cost of Drinks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(30, 26, 204, 27);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(30, 74, 204, 27);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cost of Derively");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(30, 125, 204, 27);
		panel_2.add(lblNewLabel_2_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(292, 74, 195, 27);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(292, 26, 195, 27);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(292, 125, 195, 27);
		panel_2.add(textField_9);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(504, 341, 434, 163);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tax");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4_1.setBounds(10, 29, 246, 27);
		panel_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Sub Total");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2_1.setBounds(10, 77, 246, 27);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Total");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_2_1.setBounds(10, 128, 246, 27);
		panel_1_1.add(lblNewLabel_2_2_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(273, 129, 149, 27);
		panel_1_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(273, 78, 149, 27);
		panel_1_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(273, 30, 149, 27);
		panel_1_1.add(textField_15);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(938, 56, 378, 448);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(49, 70, 288, 337);
		panel_3.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 504, 1306, 146);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_4);
		
		textField = new JTextField("Loan Management System");
		textField.setFont(new Font("Tahoma", Font.BOLD, 50));
		textField.setBounds(77, 11, 845, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
