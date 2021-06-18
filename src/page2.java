
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
	Stack ticket_stack = new Stack();
	Play play = new Play();
	Stack play_stack = play.addPlay();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public page2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 518);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Create Ticket");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(278, 49, 215, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Tickets");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(278, 107, 215, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Users");
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setBounds(278, 160, 215, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Create Membership");
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_3.setBounds(278, 214, 215, 42);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Show Members");
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_4.setBounds(278, 272, 215, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Show Plays");
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show plays
				
				
				
				
			}
		});
		btnNewButton_5.setBounds(278, 325, 215, 42);
		contentPane.add(btnNewButton_5);
	}
}
