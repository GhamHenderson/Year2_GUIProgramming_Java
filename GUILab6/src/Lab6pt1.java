import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Color;

public class Lab6pt1 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		//Create JFrane and set Visibility
		Lab6pt1 frame = new Lab6pt1();
		frame.setVisible(true);

	}


	public Lab6pt1() {
		setSize(450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		
		//Main Panel
		JPanel MainPanel = new JPanel();
		contentPane.add(MainPanel, BorderLayout.CENTER);
		MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.X_AXIS));
		
		// Inner1
		JPanel InnerPanel1 = new JPanel();
		MainPanel.add(InnerPanel1);
		InnerPanel1.setLayout(new BoxLayout(InnerPanel1, BoxLayout.X_AXIS));
		
		JLabel label1 = new JLabel("One");
		label1.setBackground(Color.PINK);
		InnerPanel1.add(label1);
		
		JLabel label2 = new JLabel("Two");
		label2.setBackground(Color.GRAY);
		InnerPanel1.add(label2);
		
		JLabel label3 = new JLabel("Three");
		label3.setBackground(Color.RED);
		InnerPanel1.add(label3);
		
		
		//Inner2
		JPanel InnerPanel2 = new JPanel();
		MainPanel.add(InnerPanel2);
		InnerPanel2.setLayout(new BoxLayout(InnerPanel2, BoxLayout.Y_AXIS));
		
		JLabel label4 = new JLabel("One");
		label4.setBackground(Color.GREEN);
		InnerPanel2.add(label4);
		
		JLabel label5 = new JLabel("Two");
		label5.setBackground(Color.CYAN);
		InnerPanel2.add(label5);
		
		JLabel label6 = new JLabel("Three");
		label6.setBackground(Color.MAGENTA);
		InnerPanel2.add(label6);
	}

}
