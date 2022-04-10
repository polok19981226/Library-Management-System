package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import railway.DbConnection;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewTeacher {

	public JFrame frame;
	private JTextField txtname;
	private JTextField txtadd;
	private JTextField txtsal;
	private JTextField txtht;
	private JLabel lblViewTeacher;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTeacher window = new ViewTeacher();
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
	public ViewTeacher() {
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
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use sms");
					
					ResultSet rs=st.executeQuery("select * from  teacher where name='"+txtname.getText()+"'");
					if(rs.next()) {
						txtadd.setText(rs.getString("address"));
						txtht.setText(rs.getString("hometown"));
						txtsal.setText(rs.getString("salary"));
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
		btnSearch.setBounds(85, 92, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(32, 56, 74, 23);
		frame.getContentPane().add(lblName);
		
		txtname = new JTextField();
		txtname.setBounds(116, 57, 222, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		JLabel label = new JLabel("Address");
		label.setBounds(32, 126, 82, 27);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Salary");
		label_1.setBounds(32, 172, 82, 27);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Home Town");
		label_2.setBounds(32, 223, 82, 27);
		frame.getContentPane().add(label_2);
		
		txtadd = new JTextField();
		txtadd.setColumns(10);
		txtadd.setBounds(116, 129, 222, 20);
		frame.getContentPane().add(txtadd);
		
		txtsal = new JTextField();
		txtsal.setColumns(10);
		txtsal.setBounds(116, 175, 222, 20);
		frame.getContentPane().add(txtsal);
		
		txtht = new JTextField();
		txtht.setColumns(10);
		txtht.setBounds(116, 226, 222, 20);
		frame.getContentPane().add(txtht);
		
		lblViewTeacher = new JLabel("View Teacher");
		lblViewTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewTeacher.setBounds(147, 11, 118, 14);
		frame.getContentPane().add(lblViewTeacher);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(276, 92, 89, 23);
		frame.getContentPane().add(btnExit);
	}

}
