import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class seat_gui extends JFrame {

	private JPanel contentPane;
	String seatno;
	boolean aa1 = true,aa2 = true,aa3 = true,aa4 = true,aa5 = true,aa6 = true,aa7 = true,aa8 = true;
	boolean bb1 = true,bb2 = true,bb3 = true,bb4 = true,bb5 = true,bb6 = true,bb7 = true,bb8 = true;
	boolean cc1 = true,cc2 = true,cc3 = true,cc4 = true,cc5 = true,cc6 = true,cc7 = true,cc8 = true;
	boolean dd1 = true,dd2 = true,dd3 = true,dd4 = true,dd5 = true,dd6 = true,dd7 = true,dd8 = true;
	boolean ee1 = true,ee2 = true,ee3 = true,ee4 = true,ee5 = true,ee6 = true,ee7 = true,ee8 = true;
	private JTextField txtSttngPlan;
	public static void main(String[] args) {
		Customer temp=new Customer();
		String temp2="";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seat_gui frame = new seat_gui(temp,temp2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void file_modify(String txt_file) {
		File fileToBeModified = new File(txt_file);
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

			String first = seatno + "+";
			String second = seatno + "-";
			String newContent = oldContent.replace(first, second);

			writer = new FileWriter(fileToBeModified);

			writer.write(newContent);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();

				writer.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public seat_gui(Customer cst,String play){
		String txt_file = play+".txt";
		Scanner sc2 = null;
		try {
			sc2 = new Scanner(new File(txt_file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();  
		}
		while (sc2.hasNextLine()) {
			Scanner s2 = new Scanner(sc2.nextLine());
			while (s2.hasNext()) {		            
				String temp = s2.next();
				if (temp.charAt(0) == 'A') {
					if (temp.charAt(1) == '1') {
						if (temp.charAt(2)=='+') {
							aa1 = true;
						}else
							aa1 = false;
					}else if (temp.charAt(1) == '2') {
						if (temp.charAt(2)=='+') {
							aa2 = true;
						}else
							aa2 = false;
					}else if (temp.charAt(1) == '3') {
						if (temp.charAt(2)=='+') {
							aa3 = true;
						}else
							aa3 = false;
					}else if (temp.charAt(1) == '4') {
						if (temp.charAt(2)=='+') {
							aa4 = true;
						}else
							aa4 = false;
					}else if (temp.charAt(1) == '5') {
						if (temp.charAt(2)=='+') {
							aa5 = true;
						}else
							aa5 = false;
					}else if (temp.charAt(1) == '6') {
						if (temp.charAt(2)=='+') {
							aa6 = true;
						}else
							aa6 = false;
					}else if (temp.charAt(1) == '7') {
						if (temp.charAt(2)=='+') {
							aa7 = true;
						}else
							aa7 = false;
					}else if (temp.charAt(1) == '8') {
						if (temp.charAt(2)=='+') {
							aa8 = true;
						}else
							aa8 = false;
					}
				}else if (temp.charAt(0) == 'B') {
					if (temp.charAt(1) == '1') {
						if (temp.charAt(2)=='+') {
							bb1 = true;
						}else
							bb1 = false;
					}else if (temp.charAt(1) == '2') {
						if (temp.charAt(2)=='+') {
							bb2 = true;
						}else
							bb2 = false;
					}else if (temp.charAt(1) == '3') {
						if (temp.charAt(2)=='+') {
							bb3 = true;
						}else
							bb3 = false;
					}else if (temp.charAt(1) == '4') {
						if (temp.charAt(2)=='+') {
							bb4 = true;
						}else
							bb4 = false;
					}else if (temp.charAt(1) == '5') {
						if (temp.charAt(2)=='+') {
							bb5 = true;
						}else
							bb5 = false;
					}else if (temp.charAt(1) == '6') {
						if (temp.charAt(2)=='+') {
							bb6 = true;
						}else
							bb6 = false;
					}else if (temp.charAt(1) == '7') {
						if (temp.charAt(2)=='+') {
							bb7 = true;
						}else
							bb7 = false;
					}else if (temp.charAt(1) == '8') {
						if (temp.charAt(2)=='+') {
							bb8 = true;
						}else
							bb8 = false;
					}
				}else if (temp.charAt(0) == 'C') {
					if (temp.charAt(1) == '1') {
						if (temp.charAt(2)=='+') {
							cc1 = true;
						}else
							cc1 = false;
					}else if (temp.charAt(1) == '2') {
						if (temp.charAt(2)=='+') {
							cc2 = true;
						}else
							cc2 = false;
					}else if (temp.charAt(1) == '3') {
						if (temp.charAt(2)=='+') {
							cc3 = true;
						}else
							cc3 = false;
					}else if (temp.charAt(1) == '4') {
						if (temp.charAt(2)=='+') {
							cc4 = true;
						}else
							cc4 = false;
					}else if (temp.charAt(1) == '5') {
						if (temp.charAt(2)=='+') {
							cc5 = true;
						}else
							cc5 = false;
					}else if (temp.charAt(1) == '6') {
						if (temp.charAt(2)=='+') {
							cc6 = true;
						}else
							cc6 = false;
					}else if (temp.charAt(1) == '7') {
						if (temp.charAt(2)=='+') {
							cc7 = true;
						}else
							cc7 = false;
					}else if (temp.charAt(1) == '8') {
						if (temp.charAt(2)=='+') {
							cc8 = true;
						}else
							cc8 = false;
					}
				}else if (temp.charAt(0) == 'D') {
					if (temp.charAt(1) == '1') {
						if (temp.charAt(2)=='+') {
							dd1 = true;
						}else
							dd1 = false;
					}else if (temp.charAt(1) == '2') {
						if (temp.charAt(2)=='+') {
							dd2 = true;
						}else
							dd2 = false;
					}else if (temp.charAt(1) == '3') {
						if (temp.charAt(2)=='+') {
							dd3 = true;
						}else
							dd3 = false;
					}else if (temp.charAt(1) == '4') {
						if (temp.charAt(2)=='+') {
							dd4 = true;
						}else
							dd4 = false;
					}else if (temp.charAt(1) == '5') {
						if (temp.charAt(2)=='+') {
							dd5 = true;
						}else
							dd5 = false;
					}else if (temp.charAt(1) == '6') {
						if (temp.charAt(2)=='+') {
							dd6 = true;
						}else
							dd6 = false;
					}else if (temp.charAt(1) == '7') {
						if (temp.charAt(2)=='+') {
							dd7 = true;
						}else
							dd7 = false;
					}else if (temp.charAt(1) == '8') {
						if (temp.charAt(2)=='+') {
							dd8 = true;
						}else
							dd8 = false;
					}
				}else if (temp.charAt(0) == 'E') {
					if (temp.charAt(1) == '1') {
						if (temp.charAt(2)=='+') {
							ee1 = true;
						}else
							ee1 = false;
					}else if (temp.charAt(1) == '2') {
						if (temp.charAt(2)=='+') {
							ee2 = true;
						}else
							ee2 = false;
					}else if (temp.charAt(1) == '3') {
						if (temp.charAt(2)=='+') {
							ee3 = true;
						}else
							ee3 = false;
					}else if (temp.charAt(1) == '4') {
						if (temp.charAt(2)=='+') {
							ee4 = true;
						}else
							ee4 = false;
					}else if (temp.charAt(1) == '5') {
						if (temp.charAt(2)=='+') {
							ee5 = true;
						}else
							ee5 = false;
					}else if (temp.charAt(1) == '6') {
						if (temp.charAt(2)=='+') {
							ee6 = true;
						}else
							ee6 = false;
					}else if (temp.charAt(1) == '7') {
						if (temp.charAt(2)=='+') {
							ee7 = true;
						}else
							ee7 = false;
					}else if (temp.charAt(1) == '8') {
						if (temp.charAt(2)=='+') {
							ee8 = true;
						}else
							ee8 = false;
					}
				}  

			}
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 591);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton a1 = new JButton("A1");
		a1.setForeground(new Color(255, 51, 255));
		a1.setBackground(new Color(255, 204, 255));
		a1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A1";
				aa1=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a1.setEnabled(aa1);
		a1.setBounds(28, 190, 85, 21);
		contentPane.add(a1);

		JButton b1 = new JButton("B1");
		b1.setForeground(new Color(255, 51, 255));
		b1.setBackground(new Color(255, 204, 255));
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B1";
				bb1=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b1.setEnabled(bb1);
		b1.setBounds(28, 221, 85, 21);
		contentPane.add(b1);

		JButton c1 = new JButton("C1");
		c1.setForeground(new Color(255, 51, 255));
		c1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c1.setBackground(new Color(255, 204, 255));
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C1";
				cc1=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c1.setEnabled(cc1);
		c1.setBounds(28, 252, 85, 21);
		contentPane.add(c1);

		JButton d1 = new JButton("D1");
		d1.setForeground(new Color(255, 51, 255));
		d1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d1.setBackground(new Color(255, 204, 255));
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D1";
				dd1=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d1.setEnabled(dd1);
		d1.setBounds(28, 283, 85, 21);
		contentPane.add(d1);

		JButton e1 = new JButton("E1");
		e1.setForeground(new Color(255, 51, 255));
		e1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e1.setBackground(new Color(255, 204, 255));
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E1";
				ee1=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e1.setEnabled(ee1);
		e1.setBounds(28, 314, 85, 21);
		contentPane.add(e1);

		JButton a2 = new JButton("A2");
		a2.setForeground(new Color(255, 51, 255));
		a2.setBackground(new Color(255, 204, 255));
		a2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A2";
				aa2=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a2.setEnabled(aa2);
		a2.setBounds(123, 190, 85, 21);
		contentPane.add(a2);

		JButton b2 = new JButton("B2");
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b2.setForeground(new Color(255, 51, 255));
		b2.setBackground(new Color(255, 204, 255));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B2";
				bb2=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b2.setEnabled(bb2);
		b2.setBounds(123, 221, 85, 21);
		contentPane.add(b2);

		JButton c2 = new JButton("C2");
		c2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c2.setForeground(new Color(255, 51, 255));
		c2.setBackground(new Color(255, 204, 255));
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C2";
				cc2=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c2.setEnabled(cc2);
		c2.setBounds(123, 252, 85, 21);
		contentPane.add(c2);

		JButton d2 = new JButton("D2");
		d2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d2.setForeground(new Color(255, 51, 255));
		d2.setBackground(new Color(255, 204, 255));
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D2";
				dd2=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d2.setEnabled(dd2);
		d2.setBounds(123, 283, 85, 21);
		contentPane.add(d2);

		JButton e2 = new JButton("E2");
		e2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e2.setForeground(new Color(255, 51, 255));
		e2.setBackground(new Color(255, 204, 255));
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E2";
				ee2=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e2.setEnabled(ee2);
		e2.setBounds(123, 314, 85, 21);
		contentPane.add(e2);

		JButton a3 = new JButton("A3");
		a3.setForeground(new Color(255, 51, 255));
		a3.setBackground(new Color(255, 204, 255));
		a3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A3";
				aa3=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a3.setEnabled(aa3);
		a3.setBounds(218, 190, 85, 21);
		contentPane.add(a3);

		JButton b3 = new JButton("B3");
		b3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b3.setForeground(new Color(255, 51, 255));
		b3.setBackground(new Color(255, 204, 255));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B3";
				bb3=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b3.setEnabled(bb3);
		b3.setBounds(218, 221, 85, 21);
		contentPane.add(b3);

		JButton c3 = new JButton("C3");
		c3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c3.setForeground(new Color(255, 51, 255));
		c3.setBackground(new Color(255, 204, 255));
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C3";
				cc3=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c3.setEnabled(cc3);
		c3.setBounds(218, 252, 85, 21);
		contentPane.add(c3);

		JButton d3 = new JButton("D3");
		d3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d3.setForeground(new Color(255, 51, 255));
		d3.setBackground(new Color(255, 204, 255));
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D3";
				dd3=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d3.setEnabled(dd3);
		d3.setBounds(218, 283, 85, 21);
		contentPane.add(d3);

		JButton e3 = new JButton("E3");
		e3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e3.setForeground(new Color(255, 51, 255));
		e3.setBackground(new Color(255, 204, 255));
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E3";
				ee3=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e3.setEnabled(ee3);
		e3.setBounds(218, 314, 85, 21);
		contentPane.add(e3);

		JButton a4 = new JButton("A4");
		a4.setForeground(new Color(255, 51, 255));
		a4.setBackground(new Color(255, 204, 255));
		a4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A4";
				aa4=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a4.setEnabled(aa4);
		a4.setBounds(313, 190, 85, 21);
		contentPane.add(a4);

		JButton b4 = new JButton("B4");
		b4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b4.setForeground(new Color(255, 51, 255));
		b4.setBackground(new Color(255, 204, 255));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B4";
				bb4=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b4.setEnabled(bb4);
		b4.setBounds(313, 221, 85, 21);
		contentPane.add(b4);

		JButton c4 = new JButton("C4");
		c4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c4.setForeground(new Color(255, 51, 255));
		c4.setBackground(new Color(255, 204, 255));
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C4";
				cc4=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c4.setEnabled(cc4);
		c4.setBounds(313, 252, 85, 21);
		contentPane.add(c4);

		JButton d4 = new JButton("D4");
		d4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d4.setForeground(new Color(255, 51, 255));
		d4.setBackground(new Color(255, 204, 255));
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D4";
				dd4=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d4.setEnabled(dd4);
		d4.setBounds(313, 283, 85, 21);
		contentPane.add(d4);

		JButton e4 = new JButton("E4");
		e4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e4.setForeground(new Color(255, 51, 255));
		e4.setBackground(new Color(255, 204, 255));
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E4";
				ee4=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e4.setEnabled(ee4);
		e4.setBounds(313, 314, 85, 21);
		contentPane.add(e4);

		JButton a5 = new JButton("A5");
		a5.setForeground(new Color(255, 51, 255));
		a5.setBackground(new Color(255, 204, 255));
		a5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A5";
				aa5=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a5.setEnabled(aa5);
		a5.setBounds(408, 190, 85, 21);
		contentPane.add(a5);

		JButton b5 = new JButton("B5");
		b5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b5.setForeground(new Color(255, 51, 255));
		b5.setBackground(new Color(255, 204, 255));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B5";
				bb5=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b5.setEnabled(bb5);
		b5.setBounds(408, 221, 85, 21);
		contentPane.add(b5);

		JButton c5 = new JButton("C5");
		c5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c5.setForeground(new Color(255, 51, 255));
		c5.setBackground(new Color(255, 204, 255));
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C5";
				cc5=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c5.setEnabled(cc5);
		c5.setBounds(408, 252, 85, 21);
		contentPane.add(c5);

		JButton d5 = new JButton("D5");
		d5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d5.setForeground(new Color(255, 51, 255));
		d5.setBackground(new Color(255, 204, 255));
		d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D5";
				dd5=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d5.setEnabled(dd5);
		d5.setBounds(408, 283, 85, 21);
		contentPane.add(d5);

		JButton e5 = new JButton("E5");
		e5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e5.setForeground(new Color(255, 51, 255));
		e5.setBackground(new Color(255, 204, 255));
		e5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E5";
				ee5=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e5.setEnabled(ee5);
		e5.setBounds(408, 314, 85, 21);
		contentPane.add(e5);

		JButton a6 = new JButton("A6");
		a6.setForeground(new Color(255, 51, 255));
		a6.setBackground(new Color(255, 204, 255));
		a6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A6";
				aa6=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a6.setEnabled(aa6);
		a6.setBounds(503, 190, 85, 21);
		contentPane.add(a6);

		JButton b6 = new JButton("B6");
		b6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b6.setForeground(new Color(255, 51, 255));
		b6.setBackground(new Color(255, 204, 255));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B6";
				bb6=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b6.setEnabled(bb6);
		b6.setBounds(503, 221, 85, 21);
		contentPane.add(b6);

		JButton c6 = new JButton("C6");
		c6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c6.setForeground(new Color(255, 51, 255));
		c6.setBackground(new Color(255, 204, 255));
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C6";
				cc6=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c6.setEnabled(cc6);
		c6.setBounds(503, 252, 85, 21);
		contentPane.add(c6);

		JButton d6 = new JButton("D6");
		d6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d6.setForeground(new Color(255, 51, 255));
		d6.setBackground(new Color(255, 204, 255));
		d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D6";
				dd6=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d6.setEnabled(dd6);
		d6.setBounds(503, 283, 85, 21);
		contentPane.add(d6);

		JButton e6 = new JButton("E6");
		e6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e6.setForeground(new Color(255, 51, 255));
		e6.setBackground(new Color(255, 204, 255));
		e6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E6";
				ee6=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e6.setEnabled(ee6);
		e6.setBounds(503, 314, 85, 21);
		contentPane.add(e6);

		JButton a7 = new JButton("A7");
		a7.setForeground(new Color(255, 51, 255));
		a7.setBackground(new Color(255, 204, 255));
		a7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A7";
				aa7=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a7.setEnabled(aa7);
		a7.setBounds(597, 190, 85, 21);
		contentPane.add(a7);

		JButton b7 = new JButton("B7");
		b7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b7.setForeground(new Color(255, 51, 255));
		b7.setBackground(new Color(255, 204, 255));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B7";
				bb7=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b7.setEnabled(bb7);
		b7.setBounds(597, 221, 85, 21);
		contentPane.add(b7);

		JButton c7 = new JButton("C7");
		c7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c7.setForeground(new Color(255, 51, 255));
		c7.setBackground(new Color(255, 204, 255));
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C7";
				cc7=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c7.setEnabled(cc7);
		c7.setBounds(597, 252, 85, 21);
		contentPane.add(c7);

		JButton d7 = new JButton("D7");
		d7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d7.setForeground(new Color(255, 51, 255));
		d7.setBackground(new Color(255, 204, 255));
		d7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D7";
				dd7=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d7.setEnabled(dd7);
		d7.setBounds(597, 283, 85, 21);
		contentPane.add(d7);

		JButton e7 = new JButton("E7");
		e7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e7.setForeground(new Color(255, 51, 255));
		e7.setBackground(new Color(255, 204, 255));
		e7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E7";
				ee7=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e7.setEnabled(ee7);
		e7.setBounds(597, 314, 85, 21);
		contentPane.add(e7);

		JButton a8 = new JButton("A8");
		a8.setBackground(new Color(255, 204, 255));
		a8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		a8.setForeground(new Color(255, 51, 255));
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="A8";
				aa8=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		a8.setEnabled(aa8);
		a8.setBounds(692, 190, 85, 21);
		contentPane.add(a8);

		JButton b8 = new JButton("B8");
		b8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		b8.setForeground(new Color(255, 51, 255));
		b8.setBackground(new Color(255, 204, 255));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="B8";
				bb8=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		b8.setEnabled(bb8);
		b8.setBounds(692, 221, 85, 21);
		contentPane.add(b8);

		JButton c8 = new JButton("C8");
		c8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c8.setForeground(new Color(255, 51, 255));
		c8.setBackground(new Color(255, 204, 255));
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="C8";
				cc8=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		c8.setEnabled(cc8);
		c8.setBounds(692, 252, 85, 21);
		contentPane.add(c8);

		JButton d8 = new JButton("D8");
		d8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		d8.setForeground(new Color(255, 51, 255));
		d8.setBackground(new Color(255, 204, 255));
		d8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="D8";
				dd8=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		d8.setEnabled(dd8);
		d8.setBounds(692, 283, 85, 21);
		contentPane.add(d8);

		JButton e8 = new JButton("E8");
		e8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		e8.setForeground(new Color(255, 51, 255));
		e8.setBackground(new Color(255, 204, 255));
		e8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatno="E8";
				ee8=false;
				file_modify(txt_file);
				show_final_ticket sft = new show_final_ticket(cst,play,seatno);
				sft.setVisible(true);
			}
		});
		e8.setEnabled(ee8);
		e8.setBounds(692, 314, 85, 21);
		contentPane.add(e8);

		txtSttngPlan = new JTextField();
		txtSttngPlan.setForeground(new Color(102, 0, 153));
		txtSttngPlan.setBackground(new Color(255, 204, 255));
		txtSttngPlan.setFont(new Font("Broadway", Font.PLAIN, 25));
		txtSttngPlan.setHorizontalAlignment(SwingConstants.CENTER);
		txtSttngPlan.setText("SITTING PLAN");
		txtSttngPlan.setBounds(123, 92, 559, 42);
		contentPane.add(txtSttngPlan);
		txtSttngPlan.setColumns(10);

	}
}
