import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Lab6Part2 extends JFrame {

	private JPanel contentPane;
	CardLayout layout = new CardLayout();
	
	public static void main(String[] args) {

		Lab6Part2 frame = new Lab6Part2();
		frame.setVisible(true);

	}

	
	public Lab6Part2() {
		setSize(500, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(2, 1));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_1512053728742500");
		
		JLabel lblNewLabel_2 = new JLabel("1");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("3");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_1512053774055400");
		
		JLabel lblNewLabel_3 = new JLabel("4");
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5");
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("6");
		panel_1.add(lblNewLabel_5);
	}
}
