package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import railway.DbConnection;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SearchStudent {

	public JFrame frame;
	private JTextField txtn;
	private JTextField tfn;
	private JTextField tc;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchStudent window = new SearchStudent();
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
	public SearchStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblSearchStudent = new JLabel("Search Student");
		lblSearchStudent.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSearchStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchStudent.setBounds(10, 11, 808, 26);
		frame.getContentPane().add(lblSearchStudent);
		
		JButton btnHomePage = new JButton("Home page");
		btnHomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StduentSection s= new StduentSection();
				frame.dispose();
				s.frame.setVisible(true);
			}
		});
		btnHomePage.setBounds(305, 145, 89, 23);
		frame.getContentPane().add(btnHomePage);
		
		
		JLabel label = new JLabel("Name:");
		label.setBounds(10, 58, 98, 27);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Father's Name:");
		label_1.setBounds(10, 96, 98, 22);
		frame.getContentPane().add(label_1);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use sms");
					
					ResultSet rs=st.executeQuery("select * from  student where name='"+txtn.getText()+"' and FatherName='"+tfn.getText()+"'");
					if(rs.next()) {
						tc.setText(rs.getString("Class"));
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "No Match Found. Please Check Again.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(102, 145, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(556, 145, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel label_2 = new JLabel("Class:");
		label_2.setBounds(381, 60, 98, 22);
		frame.getContentPane().add(label_2);
		
		txtn = new JTextField();
		txtn.setBounds(135, 61, 110, 20);
		frame.getContentPane().add(txtn);
		txtn.setColumns(10);
		
		tfn = new JTextField();
		tfn.setColumns(10);
		tfn.setBounds(135, 97, 110, 20);
		frame.getContentPane().add(tfn);
		
		tc = new JTextField();
		tc.setColumns(10);
		tc.setBounds(492, 61, 110, 20);
		frame.getContentPane().add(tc);
		
		JLabel lblRoll = new JLabel("Roll:");
		lblRoll.setBounds(381, 96, 98, 22);
		frame.getContentPane().add(lblRoll);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(492, 96, 110, 20);
		frame.getContentPane().add(textField);
		
		
	}
}
