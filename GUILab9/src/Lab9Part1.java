import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Lab9Part1 extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {

					Lab9Part1 frame = new Lab9Part1();
					frame.setVisible(true);
					frame.setTitle("Grahams Program");
	}

	
	public Lab9Part1() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		JButton button1 = new JButton("Show Message Dialog");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(button1, "Graham", "Grahams Program", JOptionPane.INFORMATION_MESSAGE);
				
				}
		});
		contentPane.add(button1);
	}
	
	


}


