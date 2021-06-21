
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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

	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel(); 
		panel.setLocation(247, 102);
		panel.setSize(422,272);
		panel.setBackground(new Color(102, 0, 153)); 
		ImageIcon icon = new ImageIcon("theatre.png"); 
		JLabel label = new JLabel(); 
		label.setIcon(icon); 
		panel.add(label);
		this.getContentPane().add(panel); 

		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt_file = "Users.txt";

				Scanner sc2 = null;
				try {
					sc2 = new Scanner(new File(txt_file));
				} catch (FileNotFoundException exception) {
					exception.printStackTrace();  
				}
				while (sc2.hasNextLine()) {
					String [] temp = sc2.nextLine().split("-");
					User user_temp = new User(temp[0], temp[1]);
					user_stack.add(user_temp);
				}
				User loginuser = new User(textField.getText(),passwordField.getText());
				boolean isUser=false;

				while(isUser==false) {
					isUser=loginuser.loggedIn(user_stack, loginuser);
					if(isUser==true) {
						JOptionPane.showMessageDialog(null, "Succesfully logged in.");
						page2 p2=new page2();
						p2.setVisible(true);
					}
					else if(isUser==false) {
						JOptionPane.showMessageDialog(null, "Wrong name or password.");
						break;
					}

				}
			}
		});
		btnNewButton.setForeground(new Color(102, 0, 153));
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {

		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton.setBounds(187, 486, 144, 44);
		contentPane.add(btnNewButton);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(255, 204, 255));
		btnSignUp.setForeground(new Color(102, 0, 153));
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField.getText().length() < 3){
					JOptionPane.showMessageDialog(null, "Username must be longer than 3!");
					GUI g = new GUI();
					g.setVisible(rootPaneCheckingEnabled);
				}else {
					if (passwordField.getText().length() < 3){
						JOptionPane.showMessageDialog(null, "Password must be longer than 3!");
						GUI g = new GUI();
						g.setVisible(rootPaneCheckingEnabled);
					}else {
						String txt_file = "Users.txt";
						boolean flag =true;
						Scanner sc2 = null;
						try {
							sc2 = new Scanner(new File(txt_file));
						} catch (FileNotFoundException exception) {
							exception.printStackTrace();  
						}
						while (sc2.hasNextLine()) {
							String [] temp = sc2.nextLine().split("-");
							if (temp[0].equals(textField.getText())) {
								flag = false;
							}
						}
						if (flag) {
							user_creation(textField.getText(),passwordField.getText());
							JOptionPane.showMessageDialog(null, "User has been created.");
							File fileToBeModified = new File("Users.txt");
							String oldContent = "";


							BufferedReader reader = null;

							FileWriter writer = null;

							try
							{
								reader = new BufferedReader(new FileReader(fileToBeModified));
								String line = reader.readLine();
								while (line != null) 
								{
									oldContent = oldContent + line + System.lineSeparator();

									if (line != null) {
										line = reader.readLine();
									}

								}

								String newContent = oldContent + textField.getText() + "-" + passwordField.getText();
								writer = new FileWriter(fileToBeModified);

								writer.write(newContent);
							}
							catch (IOException exception)
							{
								exception.printStackTrace();
							}
							finally
							{
								try
								{
									reader.close();

									writer.close();
								} 
								catch (IOException exception) 
								{
									exception.printStackTrace();
								}
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Username is already taken!");
							GUI g = new GUI();
							g.setVisible(rootPaneCheckingEnabled);
						}

					}
					
				}

			}
		});
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User loginuser=new User(textField.getText(),passwordField.getText());
				loginuser.removeUser(loginuser,user_stack);
			}
		});
		btnSignUp.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnSignUp.setBounds(386, 486, 144, 44);
		contentPane.add(btnSignUp);

		JButton btnRemoveUser = new JButton("Remove User");
		btnRemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt_file = "Users.txt";

				Scanner sc2 = null;
				try {
					sc2 = new Scanner(new File(txt_file));
				} catch (FileNotFoundException exception) {
					exception.printStackTrace();  
				}
				while (sc2.hasNextLine()) {
					String [] temp = sc2.nextLine().split("-");
					User user_temp = new User(temp[0], temp[1]);
					user_stack.add(user_temp);
				}
				User loginuser=new User(textField.getText(),passwordField.getText());
				loginuser.removeUser(loginuser,user_stack);
				JOptionPane.showMessageDialog(null, "User has been removed.");

				File fileToBeModified = new File("Users.txt");
				String oldContent = "";


				BufferedReader reader = null;

				FileWriter writer = null;

				try
				{
					reader = new BufferedReader(new FileReader(fileToBeModified));

					String newContent = "";
					int size =user_stack.size();
					for (int i = 0; i < size; i++) {
						newContent = newContent + ((User)user_stack.elementAt(i)).userName + "-" + ((User)user_stack.elementAt(i)).password + System.lineSeparator();
					}

					writer = new FileWriter(fileToBeModified);

					writer.write(newContent);
				}
				catch (IOException exception)
				{
					exception.printStackTrace();
				}
				finally
				{
					try
					{
						reader.close();

						writer.close();
					} 
					catch (IOException exception) 
					{
						exception.printStackTrace();
					}
				}
			}

		});
		btnRemoveUser.setBackground(new Color(255, 204, 255));
		btnRemoveUser.setForeground(new Color(102, 0, 153));
		btnRemoveUser.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnRemoveUser.setBounds(581, 486, 144, 44);
		contentPane.add(btnRemoveUser);

		JTextPane txtpnTheatreManagementSystem = new JTextPane();
		txtpnTheatreManagementSystem.setForeground(new Color(255, 51, 255));
		txtpnTheatreManagementSystem.setBackground(new Color(102, 0, 153));
		txtpnTheatreManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 39));
		txtpnTheatreManagementSystem.setText("Theatre Management System");
		txtpnTheatreManagementSystem.setBounds(187, 21, 563, 70);
		contentPane.add(txtpnTheatreManagementSystem);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		passwordField.setBounds(366, 430, 313, 30);
		contentPane.add(passwordField);

		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		textField.setBounds(366, 393, 313, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("User Name: ");
		lblNewLabel.setForeground(new Color(255, 51, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblNewLabel.setBounds(230, 389, 126, 30);
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setForeground(new Color(255, 51, 255));
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		lblPassword.setBounds(230, 426, 116, 30);
		contentPane.add(lblPassword);
	}
}
