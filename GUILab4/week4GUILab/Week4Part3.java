package week4GUILab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Week4Part3 extends JFrame implements ActionListener{

	JPanel panel = new JPanel();
	String[] Teams = {"Liverpool","Manchester United", "Newcastle","Tottenham Hotspur", "Manchester City"};
	JLabel topLabel = new JLabel();
	JTextArea textArea = new JTextArea();
	JComboBox<String> Combo = new JComboBox<String>(Teams);
	String selection = (String) Combo.getSelectedItem();
	
	
	public static void main(String[] args) {

					Week4Part3 frame = new Week4Part3();
					frame.setVisible(true);
	}


	
	public Week4Part3() {
		
		
		//Container
		Container contentPane = getContentPane();
		// Assigning Items to Content Pane
		contentPane.add(topLabel, BorderLayout.NORTH);
		contentPane.add(textArea, BorderLayout.SOUTH);
		contentPane.add(panel);
		
		// Panel
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(Combo);
		
		// Combo and Size
		Combo.addActionListener(this);
		topLabel.setText("Please choose your favourite team");
		setSize(800,800);
	}
		

	public void actionPerformed(ActionEvent e) {
			String selection = (String) Combo.getSelectedItem();
				textArea.setText(selection);
				
	}
	
}

