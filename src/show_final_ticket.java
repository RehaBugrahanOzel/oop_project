import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class show_final_ticket extends JFrame {

	private JPanel contentPane;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtSeat;
	private JTextField txtPrice;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Customer temp=new Customer();
				String temp2="";
				String temp3="";
				try {
					show_final_ticket frame = new show_final_ticket(temp,temp2,temp3);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public show_final_ticket(Customer cst, String play, String seatno) {
		String array[] = play.split("-");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 433);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 204, 255));
		contentPane.setBackground(new Color(102, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JLabel hall_name_label = new JLabel("hall name");
		hall_name_label.setForeground(new Color(255, 204, 255));
		hall_name_label.setText(array[3]);
		hall_name_label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		hall_name_label.setBounds(60, 248, 205, 41);
		contentPane.add(hall_name_label);

		JLabel showname_label = new JLabel("show name");
		showname_label.setForeground(new Color(255, 102, 255));
		showname_label.setText(array[0]);
		showname_label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 24));
		showname_label.setBounds(60, 73, 794, 43);
		contentPane.add(showname_label);

		JLabel seat_label = new JLabel("Seat");
		seat_label.setForeground(new Color(255, 204, 255));
		seat_label.setText(seatno);
		seat_label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		seat_label.setBounds(134, 307, 117, 43);
		contentPane.add(seat_label);

		JLabel current_date_label = new JLabel("current date");
		current_date_label.setForeground(new Color(255, 204, 255));
		Date cDate = new Date();
		cDate = cDate.CurrentDate();
		String date = cDate.day + "." + cDate.month +"." + cDate.year;
		current_date_label.setText(date);
		current_date_label.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		current_date_label.setBounds(845, 11, 129, 23);
		contentPane.add(current_date_label);

		JLabel show_date_label = new JLabel("show date");
		show_date_label.setForeground(new Color(255, 204, 255));
		show_date_label.setText(array[1]);
		show_date_label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		show_date_label.setBounds(727, 141, 257, 29);
		contentPane.add(show_date_label);

		JLabel show_time_label = new JLabel("show time");
		show_time_label.setForeground(new Color(255, 204, 255));
		show_time_label.setText(array[2]);
		show_time_label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		show_time_label.setBounds(727, 181, 257, 41);
		contentPane.add(show_time_label);

		txtDate = new JTextField();
		txtDate.setForeground(new Color(255, 102, 255));
		txtDate.setBackground(new Color(102, 0, 153));
		txtDate.setEditable(false);
		txtDate.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		txtDate.setText("Date:");
		txtDate.setBounds(635, 142, 64, 23);
		contentPane.add(txtDate);
		txtDate.setColumns(10);

		txtTime = new JTextField();
		txtTime.setBackground(new Color(102, 0, 153));
		txtTime.setForeground(new Color(255, 102, 255));
		txtTime.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		txtTime.setEditable(false);
		txtTime.setText("Time:");
		txtTime.setBounds(635, 188, 64, 23);
		contentPane.add(txtTime);
		txtTime.setColumns(10);

		txtSeat = new JTextField();
		txtSeat.setForeground(new Color(255, 102, 255));
		txtSeat.setBackground(new Color(102, 0, 153));
		txtSeat.setEditable(false);
		txtSeat.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		txtSeat.setText("Seat:");
		txtSeat.setBounds(60, 312, 64, 32);
		contentPane.add(txtSeat);
		txtSeat.setColumns(10);

		JLabel customer_name_label = new JLabel("Customer name");
		customer_name_label.setForeground(new Color(255, 204, 255));
		customer_name_label.setText(cst.nameSurname);
		customer_name_label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		customer_name_label.setBounds(60, 154, 340, 41);
		contentPane.add(customer_name_label);

		JLabel price_label = new JLabel("price");
		price_label.setForeground(new Color(255, 204, 255));
		TicketPrice tp = new TicketPrice();
		int ticketPrice = tp.discountCalc(cst);
		String ticket_price=String.valueOf(ticketPrice);
		price_label.setText(ticket_price);
		price_label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		price_label.setBounds(727, 316, 144, 14);
		contentPane.add(price_label);

		txtPrice = new JTextField();
		txtPrice.setForeground(new Color(255, 102, 255));
		txtPrice.setBackground(new Color(102, 0, 153));
		txtPrice.setEditable(false);
		txtPrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		txtPrice.setText("Price = ");
		txtPrice.setBounds(635, 303, 82, 41);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);


		JButton button_proceed = new JButton("PROCEED");
		button_proceed.setBackground(new Color(255, 204, 255));
		button_proceed.setForeground(new Color(102, 0, 153));
		button_proceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File fileToBeModified = new File("tickets.txt");
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

					String newContent = oldContent + customer_name_label.getText() + "-" + showname_label.getText()+ "-" + hall_name_label.getText() + "-" + seat_label.getText() + "-" + show_date_label.getText() + "-" + show_time_label.getText() + "-" + price_label.getText();
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

				page2 pg = new page2();
				pg.setVisible(true);

			}
		});
		button_proceed.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		button_proceed.setBounds(792, 346, 168, 41);
		contentPane.add(button_proceed);
	}
}
