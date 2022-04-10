package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingConstants;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class FrontPage {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
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
	public FrontPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 549, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOfficersSection = new JButton("Teacher Section");
		btnOfficersSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TeacherFront t = new TeacherFront();
				frame.dispose();
				t.frame.setVisible(true);
			}
		});
		btnOfficersSection.setBounds(32, 143, 132, 23);
		frame.getContentPane().add(btnOfficersSection);
		
		JButton btnStudentSection = new JButton("Student Section");
		btnStudentSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StduentSection s= new StduentSection();
				frame.dispose();
				s.frame.setVisible(true);
			}
		});
		btnStudentSection.setBounds(339, 143, 132, 23);
		frame.getContentPane().add(btnStudentSection);
		
		JButton btnExit =  new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnExit.setBounds(179, 228, 132, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblSchoolManagementSystem = new JLabel("School Management System");
		lblSchoolManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolManagementSystem.setBounds(32, 11, 468, 35);
		frame.getContentPane().add(lblSchoolManagementSystem);
	}
}
