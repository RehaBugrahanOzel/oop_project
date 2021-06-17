import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI extends JFrame {
	
	static Stack customer_stack = new Stack();
	static Stack user_stack = new Stack();
	static Stack play_stack = new Stack();
	static Stack seat_stack = new Stack();
	
	public static void user_creation(String user_name, String password) {
		User user = new User(user_name,password);
		user_stack.push(user);
	}

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

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
				
				User loginuser = new User(textField.getText(),passwordField.getText());
		    	boolean isUser=false;
		    	
		    	while(isUser==false) {
		    		isUser=loginuser.loggedIn(user_stack, loginuser);
		    		if(isUser==true) {
			    		page2();
			    	}
			    	else if(isUser==false) {
			    		JLabel err = new JLabel("ERROR");
			    		err.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
			    		err.setBounds(236, 205, 126, 30);
			    		contentPane.add(err);
			    	}
		    		
		    	}
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
		txtpnTheatreManagementSystem.setBounds(151, 48, 563, 70);
		contentPane.add(txtpnTheatreManagementSystem);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		passwordField.setBounds(372, 246, 313, 30);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		textField.setBounds(372, 209, 313, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name: ");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblNewLabel.setBounds(236, 205, 126, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		lblPassword.setBounds(236, 242, 116, 30);
		contentPane.add(lblPassword);
	}
}
