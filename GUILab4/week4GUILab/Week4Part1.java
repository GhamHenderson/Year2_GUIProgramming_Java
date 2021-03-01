package week4GUILab;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Week4Part1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtGoodMorning;

	
	public static void main(String[] args) {
	
			Week4Part1 frame = new Week4Part1();
			frame.setVisible(true);

	}

	public Week4Part1(){
		setSize(400,400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		// create Jpanel
		JPanel panel = new JPanel();
		
		contentPane.add(panel);
		JButton translateButton2 = new JButton("Translate to as French");
		panel.add(translateButton2);
		// JPanel Properties
		txtGoodMorning = new JTextField();
		txtGoodMorning.setBackground(Color.WHITE);
		contentPane.add(txtGoodMorning, BorderLayout.SOUTH);
		txtGoodMorning.setEditable(false);
		txtGoodMorning.setText("Good Morning");
		txtGoodMorning.setColumns(10);
		
		// Create Button
		JButton translateButton = new JButton("Translate to as Gaeilge");
		contentPane.add(translateButton, BorderLayout.NORTH);
		
		
		// button action listener
		translateButton.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					translateButton.setText("Translated");
					txtGoodMorning.setText("Maidin Mhaith");
					txtGoodMorning.setBackground(Color.GREEN);}
		});
		
		translateButton2.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				translateButton2.setText("Translated");
				txtGoodMorning.setText("Bonjour");
				txtGoodMorning.setBackground(Color.blue);}
		});
		
		
		
	}
}
