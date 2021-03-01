import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;


public class Lab8Part2 extends JFrame implements ActionListener {

	JPanel colorPanel = new JPanel();
	JButton leftButton = new JButton("Left Button");
	GridLayout layout = new GridLayout(2,2);
	JButton rightButton = new JButton("Right Button");
	
	private final JPanel colorPanel2 = new JPanel();
	public Lab8Part2() {
		getContentPane().setLayout(new GridLayout(2,2));
		
		
		//set a thick border on the panel
		colorPanel.setBorder(new LineBorder(Color.BLACK,5));
		this.getContentPane().add(colorPanel);
		colorPanel2.setBorder(new LineBorder(Color.BLACK,5));
		
		getContentPane().add(colorPanel2);
		this.getContentPane().add(leftButton);
		
	
		
		getContentPane().add(rightButton);
		
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		setSize(400,400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Lab8Part2();

	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == rightButton) {
		Color chosenColor = JColorChooser.showDialog(colorPanel, "Left Button", Color.BLACK);
		colorPanel2.setBackground(chosenColor);
		}
		
		if(e.getSource() == leftButton) {
		Color chosenColor = JColorChooser.showDialog(colorPanel2, "Left Button", Color.BLACK);
		colorPanel.setBackground(chosenColor);
		}
	}

}

