import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class creation_ticket extends JFrame {

	static Stack play_stack = new Stack();
	static String [] shows=new String[100];
	private JPanel contentPane;
	private JTextField txtShowdaymonthyearhourminutehall;

	public static void main(String[] args) {
		Customer temp=new Customer();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creation_ticket frame = new creation_ticket(temp);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void play_choose() {
		Play play = new Play();
		play_stack = play.addPlay();
		shows=play.getShows(play_stack);
	}

	public creation_ticket(Customer cst) {
		play_choose();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 0, 153));
		contentPane.setForeground(new Color(102, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Choose Play and Date");
		lblNewLabel.setForeground(new Color(255, 204, 255));
		lblNewLabel.setBounds(23, 29, 389, 32);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 26));
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 97, 629, 237);
		contentPane.add(scrollPane);
		JList list = new JList(shows);
		list.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		list.setBackground(new Color(102, 0, 153));
		list.setForeground(new Color(255, 102, 255));
		scrollPane.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setForeground(new Color(102, 0, 153));
		btnNewButton.setBounds(31, 368, 114, 32);
		contentPane.add(btnNewButton);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);

		txtShowdaymonthyearhourminutehall = new JTextField();
		txtShowdaymonthyearhourminutehall.setForeground(new Color(255, 204, 255));
		txtShowdaymonthyearhourminutehall.setBackground(new Color(102, 0, 153));
		txtShowdaymonthyearhourminutehall.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		txtShowdaymonthyearhourminutehall.setEditable(false);
		txtShowdaymonthyearhourminutehall.setText("Show-Day.Month.Year-Hour.Minute-Hall");
		txtShowdaymonthyearhourminutehall.setBounds(23, 72, 379, 27);
		contentPane.add(txtShowdaymonthyearhourminutehall);
		txtShowdaymonthyearhourminutehall.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Please select a play!");
					creation_ticket ct = new creation_ticket(cst);
					ct.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Selected Show: "+(String)list.getSelectedValue());
					seat_gui seat=new seat_gui(cst,(String)list.getSelectedValue());
					seat.setVisible(true);
				}
				
			}
		});
	}
}