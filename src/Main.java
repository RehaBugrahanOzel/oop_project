import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Main {

	public static void main(String[] args) {
		System.out.println("selam");
		JFrame jf = new JFrame();
		jf.setTitle("Theatre Management System");
		jf.setSize(500,600);
		jf.setLocation(100, 200);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JButton button1 = new JButton("Log In");
		JButton button2 = new JButton("Sign Up");
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		label1.setText("User Name: ");
		label2.setText("Password: ");
		
		jf.getContentPane().add(label1);
		jf.getContentPane().add(text1);
		jf.getContentPane().add(label2);
		jf.getContentPane().add(text2);
		jf.getContentPane().add(button1);
		jf.getContentPane().add(button2);
		
		JButton button3 = new JButton("Click");
		button1.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane pane1 = new JOptionPane();
				pane1.showMessageDialog(null,"Welcome");
			}
		});
		
		jf.getContentPane().add(button3);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
	}
}
