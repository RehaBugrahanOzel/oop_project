import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Canvas;
import javax.swing.JLabel;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setForeground(new Color(153, 50, 204));
		btnNewButton.setBackground(new Color(153, 50, 204));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton.setBounds(176, 325, 144, 44);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(153, 50, 204));
		btnSignUp.setForeground(new Color(153, 50, 204));
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignUp.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnSignUp.setBounds(375, 325, 144, 44);
		contentPane.add(btnSignUp);
		
		JButton btnRemoveUser = new JButton("Remove User");
		btnRemoveUser.setBackground(new Color(153, 50, 204));
		btnRemoveUser.setForeground(new Color(153, 50, 204));
		btnRemoveUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnRemoveUser.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnRemoveUser.setBounds(570, 325, 144, 44);
		contentPane.add(btnRemoveUser);
		
		JTextPane txtpnTheatreManagementSystem = new JTextPane();
		txtpnTheatreManagementSystem.setForeground(new Color(102, 0, 153));
		txtpnTheatreManagementSystem.setBackground(new Color(204, 204, 204));
		txtpnTheatreManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 39));
		txtpnTheatreManagementSystem.setText("Theatre Management System");
		txtpnTheatreManagementSystem.setBounds(163, 223, 563, 70);
		contentPane.add(txtpnTheatreManagementSystem);
	}
}
