package guiLab2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Lab2Part3 extends JFrame {

	private final JPanel panel = new JPanel();

	public static void main(String[] args) {
		
					Lab2Part3 frame = new Lab2Part3();
					frame.setVisible(true);
	}


	
	public Lab2Part3() {

		Container contentPane = getContentPane();

		
		Icon saveImage = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\guiLab2\\src\\guiLab2\\save.jpeg");
		Icon openImage = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\guiLab2\\src\\guiLab2\\open.png");

		JButton openButton = new JButton("Open");
		openButton.setIcon(saveImage);
		panel.add(openButton);
		
		JButton saveButton = new JButton("Save");
		panel.add(saveButton);
		saveButton.setIcon(openImage);
		setSize(1000,1000);
		setLocation(200,200);
		contentPane.add(panel);
		
	}
}
