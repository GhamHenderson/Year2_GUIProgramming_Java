import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Lab6Part3 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {

		Lab6Part3 frame = new Lab6Part3();
		frame.setVisible(true);

	}

	//constructor
	public Lab6Part3() {
		setSize(500, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
	}

}
