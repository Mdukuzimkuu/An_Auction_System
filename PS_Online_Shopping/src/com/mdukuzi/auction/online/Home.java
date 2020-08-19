package com.mdukuzi.auction.online;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLayeredPane;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 153));
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 57, 240, 661);
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setForeground(new Color(139, 69, 19));
		lblDashboard.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblDashboard.setBounds(10, 28, 146, 25);
		panel.add(lblDashboard);
		
		JLabel lblAuctionManager = new JLabel("Auction Manager");
		lblAuctionManager.setForeground(new Color(139, 69, 19));
		lblAuctionManager.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblAuctionManager.setBounds(10, 58, 196, 25);
		panel.add(lblAuctionManager);
		
		JLabel lblCa = new JLabel("Casting");
		lblCa.setForeground(new Color(139, 69, 19));
		lblCa.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblCa.setBounds(10, 94, 146, 25);
		panel.add(lblCa);
		
		JLabel lblAnalysis = new JLabel("Analysis");
		lblAnalysis.setForeground(new Color(139, 69, 19));
		lblAnalysis.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblAnalysis.setBounds(10, 126, 146, 25);
		panel.add(lblAnalysis);
		
		JLabel lblDashboard_3_1 = new JLabel("Account");
		lblDashboard_3_1.setForeground(new Color(139, 69, 19));
		lblDashboard_3_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblDashboard_3_1.setBounds(10, 260, 146, 25);
		panel.add(lblDashboard_3_1);
		
		JLabel lblDashboard_2_1 = new JLabel("Setting");
		lblDashboard_2_1.setForeground(new Color(139, 69, 19));
		lblDashboard_2_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblDashboard_2_1.setBounds(10, 228, 146, 25);
		panel.add(lblDashboard_2_1);
		
		JLabel lblDashboard_1_1 = new JLabel("Solds");
		lblDashboard_1_1.setForeground(new Color(139, 69, 19));
		lblDashboard_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblDashboard_1_1.setBounds(10, 192, 146, 25);
		panel.add(lblDashboard_1_1);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setForeground(new Color(139, 69, 19));
		lblCustomer.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblCustomer.setBounds(10, 162, 146, 25);
		panel.add(lblCustomer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(249, 11, 1101, 14);
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(249, 24, 1111, 22);
		panel_1_1.setBackground(new Color(248, 248, 255));
		frame.getContentPane().add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(249, 46, 1101, 22);
		panel_1_2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Help");
		lblNewLabel_1.setBounds(1067, 0, 34, 14);
		panel_1_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Login");
		lblNewLabel_1_1.setBounds(1027, 0, 41, 14);
		panel_1_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SignUp");
		lblNewLabel_1_1_1.setBounds(981, 0, 61, 14);
		panel_1_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Purchases");
		lblNewLabel_1_1_2.setBounds(917, 0, 61, 14);
		panel_1_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Packages");
		lblNewLabel_1_1_3.setBounds(836, 0, 61, 14);
		panel_1_2.add(lblNewLabel_1_1_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 0, 240, 57);
		panel_2.setBackground(new Color(240, 255, 240));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(255, 255, 224));
		lblNewLabel.setBounds(10, 0, 114, 57);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(1340, 57, -775, 22);
		frame.getContentPane().add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1348, 79, -1093, 639);
		frame.getContentPane().add(scrollPane);
	}
}
