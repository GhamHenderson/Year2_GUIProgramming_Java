package guiLab2;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Lab2Part2 extends JFrame {

	public static void main(String[] args) {
		JFrame jFrame = new Lab2Part2();
		jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		
	}

	public Lab2Part2() {
		
		JPanel labelPanel = new JPanel();
		JLabel labelWithImage = new JLabel("This is a label with an Image");
		JLabel labelWithoutImage = new JLabel("This is a label witout an Image");
		Container contentPane = getContentPane();
		
		// Size and Names
		setTitle("Frame");
		setSize(300,300);
		setVisible(true);
		setLocation(300,300);
		
		// Jlabels
		labelPanel.add(labelWithImage);
		labelPanel.add(labelWithoutImage);
		
		//Icon
		Icon icon = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\guiLab2\\src\\guiLab2\\save.jpeg");
		labelWithImage.setIcon(icon);
		labelPanel.add(labelWithImage);
		
		contentPane.add(labelPanel);
		
		
	}
}
