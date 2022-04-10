package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import railway.DbConnection;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddStudent {

	public JFrame frame;
	private JTextField txtfname;
	private JTextField txtfn;
	private JTextField txtmn;
	private JTextField txtfo;
	private JTextField txtheight;
	private JTextField txtclass;
	private JTextField txtln;
	private JTextField txtmo;
	private JTextField txtdob;
	private JTextField txtage;
	private JTextField txtmobile;
	private JTextField txtemail;
	private JTextField txtnationality;
	private JTextField txtgender;
	private JTextField txtvillage;
	private JTextField txtthana;
	private JTextField txtpost;
	private JTextField txtdistrict;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
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
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 859, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewStudent = new JLabel("New Student");
		lblNewStudent.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewStudent.setBounds(10, 11, 823, 31);
		frame.getContentPane().add(lblNewStudent);
		
		JLabel lblName = new JLabel("First Name:");
		lblName.setBounds(20, 73, 98, 27);
		frame.getContentPane().add(lblName);
		
		JLabel lblFathersName = new JLabel("Father's Name:");
		lblFathersName.setBounds(20, 111, 98, 22);
		frame.getContentPane().add(lblFathersName);
		
		JLabel lblMothersName = new JLabel("Mother's Name:");
		lblMothersName.setBounds(460, 111, 98, 22);
		frame.getContentPane().add(lblMothersName);
		
		JLabel lblFathersOccupation = new JLabel("Father's Occupation:");
		lblFathersOccupation.setBounds(20, 144, 125, 22);
		frame.getContentPane().add(lblFathersOccupation);
		
		JLabel lblFathersSalary = new JLabel("Height:");
		lblFathersSalary.setBounds(20, 210, 98, 22);
		frame.getContentPane().add(lblFathersSalary);
		
		txtfname = new JTextField();
		txtfname.setBounds(225, 76, 104, 20);
		frame.getContentPane().add(txtfname);
		txtfname.setColumns(10);
		
		txtfn = new JTextField();
		txtfn.setColumns(10);
		txtfn.setBounds(225, 112, 104, 20);
		frame.getContentPane().add(txtfn);
		
		txtmn = new JTextField();
		txtmn.setColumns(10);
		txtmn.setBounds(603, 112, 105, 20);
		frame.getContentPane().add(txtmn);
		
		txtfo = new JTextField();
		txtfo.setColumns(10);
		txtfo.setBounds(225, 145, 104, 20);
		frame.getContentPane().add(txtfo);
		
		txtheight = new JTextField();
		txtheight.setColumns(10);
		txtheight.setBounds(225, 211, 104, 20);
		frame.getContentPane().add(txtheight);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,fn,mn,fo,home,c;
				name=txtfname.getText();
				fn=txtfn.getText();
				mn=txtmn.getText();
				fo=txtfo.getText();
				home=txtheight.getText();
				c=txtclass.getText();
				
				
				
			try {
				Connection con = DbConnection.getConnection();
				Statement st = con.createStatement();
				//st.executeUpdate("create database sms");
				st.executeUpdate("use sms");
				//st.executeUpdate("create table student(name varchar(20),FatherName varchar(20),MotherName varchar(20),FatherOccupation varchar(20),HomeTown varchar(10),Class varchar(10))");
				st.executeUpdate("insert into student values('"+name+"','"+fn+"','"+mn+"','"+fo+"','"+home+"','"+c+"')");
				JOptionPane.showMessageDialog(null, "Student Add Successfully");
				frame.dispose();
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		btnEnter.setBounds(105, 418, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(656, 418, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setBounds(20, 243, 98, 22);
		frame.getContentPane().add(lblClass);
		
		txtclass = new JTextField();
		txtclass.setColumns(10);
		txtclass.setBounds(225, 244, 104, 20);
		frame.getContentPane().add(txtclass);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(460, 73, 98, 27);
		frame.getContentPane().add(lblLastName);
		
		txtln = new JTextField();
		txtln.setColumns(10);
		txtln.setBounds(604, 76, 104, 20);
		frame.getContentPane().add(txtln);
		
		JLabel lblMathersOccupation = new JLabel("Mother's Occupation:");
		lblMathersOccupation.setBounds(460, 144, 125, 22);
		frame.getContentPane().add(lblMathersOccupation);
		
		txtmo = new JTextField();
		txtmo.setColumns(10);
		txtmo.setBounds(603, 145, 104, 20);
		frame.getContentPane().add(txtmo);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth:");
		lblDateOfBirth.setBounds(20, 177, 98, 22);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(460, 177, 98, 22);
		frame.getContentPane().add(lblAge);
		
		JLabel lblMobile = new JLabel("Mobile:");
		lblMobile.setBounds(460, 210, 98, 22);
		frame.getContentPane().add(lblMobile);
		
		txtdob = new JTextField();
		txtdob.setColumns(10);
		txtdob.setBounds(225, 178, 104, 20);
		frame.getContentPane().add(txtdob);
		
		txtage = new JTextField();
		txtage.setColumns(10);
		txtage.setBounds(604, 178, 104, 20);
		frame.getContentPane().add(txtage);
		
		txtmobile = new JTextField();
		txtmobile.setColumns(10);
		txtmobile.setBounds(604, 211, 104, 20);
		frame.getContentPane().add(txtmobile);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(603, 244, 104, 20);
		frame.getContentPane().add(txtemail);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(460, 243, 98, 22);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNationality = new JLabel("Nationality:");
		lblNationality.setBounds(20, 274, 98, 22);
		frame.getContentPane().add(lblNationality);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(460, 274, 98, 22);
		frame.getContentPane().add(lblGender);
		
		txtnationality = new JTextField();
		txtnationality.setColumns(10);
		txtnationality.setBounds(225, 275, 104, 20);
		frame.getContentPane().add(txtnationality);
		
		txtgender = new JTextField();
		txtgender.setColumns(10);
		txtgender.setBounds(604, 275, 104, 20);
		frame.getContentPane().add(txtgender);
		
		txtvillage = new JTextField();
		txtvillage.setColumns(10);
		txtvillage.setBounds(225, 339, 104, 20);
		frame.getContentPane().add(txtvillage);
		
		txtthana = new JTextField();
		txtthana.setColumns(10);
		txtthana.setBounds(604, 339, 104, 20);
		frame.getContentPane().add(txtthana);
		
		txtpost = new JTextField();
		txtpost.setColumns(10);
		txtpost.setBounds(225, 370, 104, 20);
		frame.getContentPane().add(txtpost);
		
		txtdistrict = new JTextField();
		txtdistrict.setColumns(10);
		txtdistrict.setBounds(604, 370, 104, 20);
		frame.getContentPane().add(txtdistrict);
		
		JLabel lblPostOffice = new JLabel("Post Office:");
		lblPostOffice.setBounds(20, 369, 98, 22);
		frame.getContentPane().add(lblPostOffice);
		
		JLabel lblThana = new JLabel("Thana:");
		lblThana.setBounds(460, 338, 98, 22);
		frame.getContentPane().add(lblThana);
		
		JLabel lblDistrict = new JLabel("District:");
		lblDistrict.setBounds(460, 369, 98, 22);
		frame.getContentPane().add(lblDistrict);
		
		JLabel lblVillage = new JLabel("Village:");
		lblVillage.setBounds(20, 338, 98, 22);
		frame.getContentPane().add(lblVillage);
		
		JButton btnHomePage = new JButton("Home page");
		btnHomePage.setBounds(383, 418, 89, 23);
		frame.getContentPane().add(btnHomePage);
		
		JLabel lblBloodGroup = new JLabel("Blood Group:");
		lblBloodGroup.setBounds(460, 305, 98, 22);
		frame.getContentPane().add(lblBloodGroup);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(604, 306, 104, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblPermanentPresentAddress = new JLabel("Permanent/ Present Address");
		lblPermanentPresentAddress.setBounds(20, 313, 195, 14);
		frame.getContentPane().add(lblPermanentPresentAddress);
	}
}
