import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listing extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			String txt_name = "";
			public void run() {
				try {
					listing frame = new listing(txt_name);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public listing(String txt_name) {
		getContentPane().setBackground(new Color(102, 0, 153));
		String txt_file = txt_name+".txt";
		if (txt_name.equals("Users")) {
			String str = "";
			Scanner sc2 = null;
		    try {
		        sc2 = new Scanner(new File(txt_file));
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();  
		    }
		    while (sc2.hasNextLine()) {
		    	String temp[] = sc2.nextLine().split("-");
		    	str = str + temp[0] + ",";
		    }
			String text[] = str.split(",");
		    
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1026, 657);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			 contentPane.setLayout(null);

			 JScrollPane scrollPane = new JScrollPane();
		        scrollPane.setBounds(112, 154, 794, 274);
		        contentPane.add(scrollPane);
		        JList list = new JList(text);
		        list.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		        list.setBackground(new Color(102, 0, 153));
		        list.setForeground(new Color(255, 102, 255));
		        scrollPane.setViewportView(list);
		        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		        
		        JButton backToMenuBtn = new JButton("Back to Menu");
		        backToMenuBtn.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		page2 pg = new page2();
				        pg.setVisible(true);
		        		
		        	}
		        });
		        backToMenuBtn.setBounds(764, 457, 142, 36);
		        contentPane.add(backToMenuBtn);
		        String header = txt_name + " List";
		        JLabel Header = new JLabel("New label");
		        Header.setText(header);
		        Header.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		        Header.setBounds(351, 75, 307, 36);
		        contentPane.add(Header);
		}
		else {
			String str = "";
			Scanner sc2 = null;
		    try {
		        sc2 = new Scanner(new File(txt_file));
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();  
		    }
		    while (sc2.hasNextLine()) {

		    	str = str + sc2.nextLine() + ",";
		    	
		    }
			String text[] = str.split(",");
		    
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1026, 657);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			 contentPane.setLayout(null);

			 JScrollPane scrollPane = new JScrollPane();
		        scrollPane.setBounds(112, 154, 794, 274);
		        contentPane.add(scrollPane);
		        JList list = new JList(text);
		        list.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		        list.setBackground(new Color(102, 0, 153));
		        list.setForeground(new Color(255, 102, 255));
		        scrollPane.setViewportView(list);
		        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		        
		        JButton backToMenuBtn = new JButton("Back to Menu");
		        backToMenuBtn.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		page2 pg = new page2();
				        pg.setVisible(true);
		        	}
		        });
		        backToMenuBtn.setBounds(764, 457, 142, 36);
		        contentPane.add(backToMenuBtn);
		        String header = txt_name + " List";
		        JLabel Header = new JLabel("New label");
		        Header.setText(header);
		        Header.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		        Header.setBounds(351, 75, 307, 36);
		        contentPane.add(Header);
		}
		
	}

}
