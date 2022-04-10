package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import railway.DbConnection;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DeleteTeacher {

	public JFrame frame;
	private JTextField txtname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteTeacher window = new DeleteTeacher();
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
	public DeleteTeacher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRetirementResign = new JLabel("Retirement / Resign");
		lblRetirementResign.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetirementResign.setBounds(130, 11, 153, 29);
		frame.getContentPane().add(lblRetirementResign);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 88, 48, 14);
		frame.getContentPane().add(lblName);
		
		txtname = new JTextField();
		txtname.setBounds(159, 85, 145, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name;
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use sms");
					name=txtname.getText();
					st.executeUpdate("update teacher set name=0 where name='"+name+"' ");
					JOptionPane.showMessageDialog(null, "Deleted from database");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnEnter.setBounds(55, 155, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(259, 155, 89, 23);
		frame.getContentPane().add(btnExit);
	}

}
