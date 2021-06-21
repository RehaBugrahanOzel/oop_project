
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class page2 extends JFrame {
	
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 frame = new page2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public page2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Create Ticket");
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setForeground(new Color(102, 0, 153));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ticket_gui ticketg=new ticket_gui();
				ticketg.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(256, 63, 243, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Tickets");
		btnNewButton_1.setBackground(new Color(255, 204, 255));
		btnNewButton_1.setForeground(new Color(102, 0, 153));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listing list = new listing("Tickets");
				list.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(256, 121, 243, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Users");
		btnNewButton_2.setBackground(new Color(255, 204, 255));
		btnNewButton_2.setForeground(new Color(102, 0, 153));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listing list = new listing("Users");
				list.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(256, 174, 243, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Show Customers");
		btnNewButton_4.setBackground(new Color(255, 204, 255));
		btnNewButton_4.setForeground(new Color(102, 0, 153));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listing list = new listing("Customers");
				list.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_4.setBounds(256, 227, 243, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Show Plays");
		btnNewButton_5.setBackground(new Color(255, 204, 255));
		btnNewButton_5.setForeground(new Color(102, 0, 153));
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listing list = new listing("Plays");
				list.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(256, 280, 243, 42);
		contentPane.add(btnNewButton_5);
	}
}
