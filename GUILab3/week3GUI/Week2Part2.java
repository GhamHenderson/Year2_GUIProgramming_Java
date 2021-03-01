package week3GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Week2Part2 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
					Week2Part2 frame = new Week2Part2();
					frame.setVisible(true);

	}

	public Week2Part2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String[] teams = {"United","City","Chelsea","Wolves","Liverpool","West Ham","Spurs","Aston Villa","Everton"};
		
		JList<String> list = new JList<String>(teams);
		contentPane.add(list, BorderLayout.SOUTH);
		
	}

}
