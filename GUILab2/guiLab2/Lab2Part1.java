package guiLab2;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Lab2Part1 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		
		Lab2Part1 frame = new Lab2Part1();
		frame.setVisible(true);
					
	}
	
	
	public Lab2Part1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
		setBounds(300,300,300,300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		setResizable(false);
	}

}
