
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Create Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(Actio41, 23e) {
				
				
			}
		});
		btnNewButton.setBounds(166, 26, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("show tickets");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerfo41d(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(166, 58, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewBut41_2 = new JButton("show users");
		btnNewButton_2.setBounds(166, 92, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 =41w JButton("create membership");
		btnNewButton_3.setBounds(166, 126, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButto41 = new JButton("show members");
		btnNewButton_4.setBounds(166, 160, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("show plays");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	41, 196w plays
				
				
				
			}
		});
		btnNewButton_5.setBounds(166, 194, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
