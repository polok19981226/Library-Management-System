package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TeacherSection {

	public JFrame frame;
	private JTextField txtname;
	private JTextField txtaddress;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherSection window = new TeacherSection();
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
	public TeacherSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 876, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("First Name:");
		lblName.setBounds(21, 40, 115, 27);
		frame.getContentPane().add(lblName);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(21, 154, 82, 27);
		frame.getContentPane().add(lblSalary);
		
		JLabel lblHomeTown = new JLabel("Experience:");
		lblHomeTown.setBounds(21, 230, 82, 27);
		frame.getContentPane().add(lblHomeTown);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,address,hometown,salary;
				name=txtname.getText();
				address=txtaddress.getText();
				hometown=txtht.getText();
				salary=txtsal.getText();
				
			try {
				Connection con= DbConnection.getConnection();
				Statement st= con.createStatement();
				//st.executeUpdate("create database sms");
				st.executeUpdate("use sms");
				//st.executeUpdate("create table teacher(name varchar(20),address varchar(20),hometown varchar(20),salary varchar(20))");
				st.executeUpdate("insert into teacher values('"+name+"','"+address+"','"+hometown+"','"+salary+"')");
				JOptionPane.showMessageDialog(null, "New Teacher Recruitment  Successfully");
				frame.dispose();
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		btnOk.setBounds(99, 415, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(613, 415, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Teacher Recruitment");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(220, 11, 271, 21);
		frame.getContentPane().add(lblNewLabel);
		
		txtname = new JTextField();
		txtname.setBounds(174, 43, 96, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtaddress = new JTextField();
		txtaddress.setColumns(10);
		txtaddress.setBounds(174, 157, 96, 20);
		frame.getContentPane().add(txtaddress);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(391, 40, 115, 27);
		frame.getContentPane().add(lblLastName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(555, 43, 96, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(21, 78, 115, 27);
		frame.getContentPane().add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 81, 96, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(391, 78, 115, 27);
		frame.getContentPane().add(lblHeight);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(555, 81, 96, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblMobile = new JLabel("Mobile:");
		lblMobile.setBounds(21, 116, 82, 27);
		frame.getContentPane().add(lblMobile);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 119, 96, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(555, 119, 96, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(390, 116, 82, 27);
		frame.getContentPane().add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(555, 157, 96, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblGender = new JLabel("gender:");
		lblGender.setBounds(391, 154, 82, 27);
		frame.getContentPane().add(lblGender);
		
		JLabel lblReligion = new JLabel("Religion:");
		lblReligion.setBounds(21, 192, 82, 27);
		frame.getContentPane().add(lblReligion);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(174, 195, 96, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(174, 195, 96, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(555, 195, 96, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblNationality = new JLabel("Nationality:");
		lblNationality.setBounds(390, 192, 82, 27);
		frame.getContentPane().add(lblNationality);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "Yes", "No"}));
		comboBox.setBounds(174, 232, 96, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblPositionRank = new JLabel("Position Rank:");
		lblPositionRank.setBounds(391, 230, 82, 27);
		frame.getContentPane().add(lblPositionRank);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(555, 233, 96, 20);
		frame.getContentPane().add(textField_9);
		
		JLabel lblQualification = new JLabel("Qualification:");
		lblQualification.setBounds(21, 268, 82, 27);
		frame.getContentPane().add(lblQualification);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(174, 271, 96, 20);
		frame.getContentPane().add(textField_10);
		
		JLabel lblHigherStudy = new JLabel("Lobbing:");
		lblHigherStudy.setBounds(390, 268, 82, 27);
		frame.getContentPane().add(lblHigherStudy);
		
		JButton btnHomePage = new JButton("Home Page");
		btnHomePage.setBounds(339, 415, 89, 23);
		frame.getContentPane().add(btnHomePage);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(555, 271, 96, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address");
		lblPermanentAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPermanentAddress.setBounds(21, 311, 131, 23);
		frame.getContentPane().add(lblPermanentAddress);
		
		JLabel lblVillage = new JLabel("Village:");
		lblVillage.setBounds(21, 345, 82, 27);
		frame.getContentPane().add(lblVillage);
		
		JLabel lblPostOffice = new JLabel("Post Office:");
		lblPostOffice.setBounds(21, 377, 82, 27);
		frame.getContentPane().add(lblPostOffice);
		
		JLabel lblThana = new JLabel("Thana:");
		lblThana.setBounds(391, 345, 82, 27);
		frame.getContentPane().add(lblThana);
		
		JLabel lblDistrict = new JLabel("District:");
		lblDistrict.setBounds(391, 377, 82, 27);
		frame.getContentPane().add(lblDistrict);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(555, 348, 96, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(555, 380, 96, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(174, 348, 96, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(174, 380, 96, 20);
		frame.getContentPane().add(textField_15);
	}
}
