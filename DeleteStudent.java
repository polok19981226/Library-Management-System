package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import railway.DbConnection;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	public JFrame frame;
	private JTextField txtname;
	private JTextField txtc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
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
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDeleteStudent = new JLabel("Delete Student");
		lblDeleteStudent.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeleteStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteStudent.setBounds(215, 11, 288, 29);
		frame.getContentPane().add(lblDeleteStudent);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(27, 83, 85, 29);
		frame.getContentPane().add(lblName);
		
		JLabel lblClass = new JLabel("Father:");
		lblClass.setBounds(27, 143, 85, 29);
		frame.getContentPane().add(lblClass);
		
		JButton btnNewButton = new JButton("Delete Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,fathername;
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use sms");
					name=txtname.getText();
					fathername=txtc.getText();
					st.executeUpdate("update student set name=0 where name='"+name+"' and FatherName='"+fathername+"'");
					JOptionPane.showMessageDialog(null, "Deleted from database");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(126, 236, 138, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(422, 236, 138, 29);
		frame.getContentPane().add(btnExit);
		
		txtname = new JTextField();
		txtname.setBounds(200, 87, 303, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtc = new JTextField();
		txtc.setColumns(10);
		txtc.setBounds(200, 147, 303, 20);
		frame.getContentPane().add(txtc);
	}

}
