package week3GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Week3Part1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		
				try {
					Week3Part1 frame = new Week3Part1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}


	public Week3Part1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username : ");
		usernameLabel.setBounds(78, 55, 69, 42);
		contentPane.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(78, 137, 69, 14);
		contentPane.add(passwordLabel);
		
		textField = new JTextField();
		textField.setBounds(192, 66, 199, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 134, 199, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel bankLabel = new JLabel("Bank Of Ireland");
		bankLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		bankLabel.setBounds(233, 28, 115, 14);
		contentPane.add(bankLabel);
	}
}
