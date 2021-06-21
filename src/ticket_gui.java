import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;

public class ticket_gui extends JFrame {

	private JPanel contentPane;
	private JTextField phonenumber;
	static Stack customer_stack = new Stack();
	private JTextField name;
	private JTextField phone;
	private JTextField email;
	private JTextField age;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket_gui frame = new ticket_gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static boolean isNumeric(String str) { 
		try{
			Long.parseLong(str);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	public ticket_gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 640);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Does customer have a record in the system?");
		lblNewLabel.setForeground(new Color(255, 204, 255));
		lblNewLabel.setBackground(new Color(102, 0, 153));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel.setBounds(161, 32, 546, 40);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("If yes then enter phone number");
		lblNewLabel_1.setForeground(new Color(255, 102, 255));
		lblNewLabel_1.setBackground(new Color(102, 0, 153));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1.setBounds(48, 109, 357, 21);
		contentPane.add(lblNewLabel_1);


		phonenumber = new JTextField();


		phonenumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));

		phonenumber.setBounds(48, 151, 236, 20);
		contentPane.add(phonenumber);
		phonenumber.setColumns(10);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



				String txt_file = "Customers.txt";

				Scanner sc2 = null;
				try {
					sc2 = new Scanner(new File(txt_file));
				} catch (FileNotFoundException exception) {
					exception.printStackTrace();  
				}
				while (sc2.hasNextLine()) {
					String [] temp = sc2.nextLine().split("-");
					boolean isStudent=false;
					if (temp[4].equals("yes")) {
						isStudent = true;
					}
					Customer customer_temp = new Customer(temp[1], temp[0], temp[2], Integer.parseInt(temp[3]), isStudent);
					customer_stack.add(customer_temp);
				}
				String phone_num=phonenumber.getText();


				Customer customerInfo=new Customer();
				boolean isCustomer = false;
				int customer_stack_size = customer_stack.size();
				for (int i = 0; i < customer_stack_size; i++) {

					if (((Customer)customer_stack.elementAt(i)).phoneNumber.equals(phone_num)) {

						customerInfo = (Customer)customer_stack.elementAt(i);
						isCustomer = true;
						JOptionPane.showMessageDialog(null, "Customer exist.");
						creation_ticket ct=new creation_ticket(customerInfo);
						ct.setVisible(true);


					}

				}
				if (!isCustomer) {
					JOptionPane.showMessageDialog(null, "Customer does not exist.");

				}

			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton.setBounds(294, 151, 111, 21);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("If no then create customer");
		lblNewLabel_3.setForeground(new Color(255, 102, 255));
		lblNewLabel_3.setBackground(new Color(102, 0, 153));
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(461, 109, 346, 21);
		contentPane.add(lblNewLabel_3);

		JCheckBox isStudent = new JCheckBox("Student");
		isStudent.setForeground(new Color(255, 204, 255));
		isStudent.setBackground(new Color(102, 0, 153));
		isStudent.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		isStudent.setBounds(626, 378, 136, 21);
		contentPane.add(isStudent);


		JLabel lblNewLabel_2 = new JLabel("Name Surname:");
		lblNewLabel_2.setForeground(new Color(255, 204, 255));
		lblNewLabel_2.setBackground(new Color(102, 0, 153));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_2.setBounds(461, 162, 209, 21);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("Phone Number:  ");
		lblNewLabel_4.setForeground(new Color(255, 204, 255));
		lblNewLabel_4.setBackground(new Color(102, 0, 153));
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_4.setBounds(461, 214, 174, 31);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("E-mail: ");
		lblNewLabel_5.setForeground(new Color(255, 204, 255));
		lblNewLabel_5.setBackground(new Color(102, 0, 153));
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_5.setBounds(464, 272, 152, 19);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Age: ");
		lblNewLabel_6.setForeground(new Color(255, 204, 255));
		lblNewLabel_6.setBackground(new Color(102, 0, 153));
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_6.setBounds(461, 317, 62, 34);
		contentPane.add(lblNewLabel_6);

		JButton create_customer = new JButton("Submit");
		create_customer.setBackground(new Color(255, 204, 255));
		create_customer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isNumeric(phone.getText())) {

					JOptionPane.showMessageDialog(null, "Invalid phone number!");
					ticket_gui tcg = new ticket_gui();
					tcg.setVisible(true);

				}
				else {

					if(!isNumeric(age.getText())) {

						JOptionPane.showMessageDialog(null, "Invalid age!");
						ticket_gui tcg = new ticket_gui();
						tcg.setVisible(true);

					}else {

						if(name.getText().length() == 0 && email.getText().length() == 0) {

							JOptionPane.showMessageDialog(null, "Invalid Name and Email!");
							ticket_gui tcg = new ticket_gui();
							tcg.setVisible(true);

						}else if(name.getText().length() == 0) {

							JOptionPane.showMessageDialog(null, "Invalid Name!");
							ticket_gui tcg = new ticket_gui();
							tcg.setVisible(true);

						}else if (email.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Invalid Email!");
							ticket_gui tcg = new ticket_gui();
							tcg.setVisible(true);
						}else {
							int c_age=Integer.parseInt(age.getText());
							Customer new_cust=new Customer(name.getText(),phone.getText(),email.getText(),c_age,isStudent.isSelected());
							customer_stack.push(new_cust);
							File fileToBeModified = new File("Customers.txt");
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
								String isStudentString = "";
								if (new_cust.isStudent) {
									isStudentString = "yes";
								}else
									isStudentString = "no";

								String newContent = oldContent + new_cust.phoneNumber + "-" + new_cust.nameSurname + "-"+ new_cust.emailAddress + "-"+ new_cust.age + "-"+ isStudentString;
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
							JOptionPane.showMessageDialog(null, "Customer has been created.");
							creation_ticket ct=new creation_ticket(new_cust);
							ct.setVisible(true);
						}

					}

				}

			}
		});


		name = new JTextField();
		name.setBounds(626, 166, 181, 19);
		contentPane.add(name);
		name.setColumns(10);


		phone = new JTextField();
		phone.setBounds(626, 223, 181, 19);
		contentPane.add(phone);
		phone.setColumns(10);


		email = new JTextField();
		email.setBounds(626, 275, 181, 19);
		contentPane.add(email);
		email.setColumns(10);


		age = new JTextField();
		age.setBounds(626, 328, 181, 19);
		contentPane.add(age);
		age.setColumns(10);


		create_customer.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		create_customer.setBounds(626, 454, 123, 21);
		contentPane.add(create_customer);
		JButton backToMenuBtn = new JButton("Back to Menu");
		backToMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				page2 pg = new page2();
				pg.setVisible(true);

			}
		});
		backToMenuBtn.setBounds(27, 523, 142, 36);
		contentPane.add(backToMenuBtn);


	}
}
