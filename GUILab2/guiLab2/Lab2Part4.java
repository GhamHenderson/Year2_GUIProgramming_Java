package guiLab2;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Lab2Part4 extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Lab2Part4 frame = new Lab2Part4();
		frame.setVisible(true);
		
		
	}


	public Lab2Part4() {
		
		JPanel holderPanel = new JPanel();
		Container contentPane = getContentPane();
		setSize(800,800);
		setLocation(200,200);
		setTitle("About Me");
		
		JTextField textField = new JTextField("Graham");
		JTextArea textArea = new JTextArea("I am known as Ginger Spice");
		Icon ImageofMe = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\guiLab2\\src\\guiLab2\\red.jpg");
		
		Icon likeIcon = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\guiLab2\\src\\guiLab2\\like.jpg");
		
		JLabel myLabel = new JLabel("This is an Image of me");
		myLabel.setFont(new Font("Serif", Font.BOLD, 12));
		
		myLabel.setIcon(ImageofMe);
		JButton likeButton = new JButton("Like", likeIcon);

		
		holderPanel.add(textField);
		holderPanel.add(textArea);
		holderPanel.add(myLabel);
		holderPanel.add(likeButton);
		
		
		contentPane.add(holderPanel);
	}

}
