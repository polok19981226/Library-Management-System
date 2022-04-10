package meghla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TeacherFront {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherFront window = new TeacherFront();
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
	public TeacherFront() {
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
		
		JButton button_2 = new JButton("View");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewTeacher v =new ViewTeacher();
				frame.dispose();
				v.frame.setVisible(true);
			}
		});
		button_2.setBounds(24, 190, 116, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label = new JLabel("Teacher Section ");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(154, 11, 116, 14);
		frame.getContentPane().add(label);
		
		JButton button_3 = new JButton("Recruitment");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TeacherSection t= new TeacherSection();
				frame.dispose();
				t.frame.setVisible(true);
			}
		});
		button_3.setBounds(24, 89, 116, 23);
		frame.getContentPane().add(button_3);
		
		JButton btnRetirement = new JButton("Retirement");
		btnRetirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeleteTeacher d= new DeleteTeacher();
				frame.dispose();
				d.frame.setVisible(true);
			}
		});
		btnRetirement.setBounds(274, 89, 109, 23);
		frame.getContentPane().add(btnRetirement);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		button_1.setBounds(274, 190, 116, 23);
		frame.getContentPane().add(button_1);
	}

}
