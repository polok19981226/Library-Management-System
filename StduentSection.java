package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class StduentSection {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StduentSection window = new StduentSection();
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
	public StduentSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 767, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New Admission");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddStudent a= new AddStudent();
				frame.dispose();
				a.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(175, 106, 148, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeleteStudent d=new DeleteStudent();
				frame.dispose();
				d.frame.setVisible(true);
			}
		});
		btnDeleteStudent.setBounds(442, 106, 148, 23);
		frame.getContentPane().add(btnDeleteStudent);
		
		JButton btnSearchStudent = new JButton("Search Student");
		btnSearchStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SearchStudent s=new SearchStudent();
				frame.dispose();
				s.frame.setVisible(true);
			}
		});
		btnSearchStudent.setBounds(175, 228, 148, 23);
		frame.getContentPane().add(btnSearchStudent);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(442, 228, 148, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblStudentSection = new JLabel("Student Section");
		lblStudentSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentSection.setBounds(252, 11, 244, 33);
		frame.getContentPane().add(lblStudentSection);
	}

}
