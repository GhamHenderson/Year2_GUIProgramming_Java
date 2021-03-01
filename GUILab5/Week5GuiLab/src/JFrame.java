import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {

					JFrame frame = new JFrame();
					frame.setVisible(true);

	}


	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label = new JLabel("New label");
		Label.setIcon(new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Vodafone.gif"));
		Label.setBounds(10, 11, 414, 74);
		contentPane.add(Label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton.setText("Hello");
				
			}
		});
		btnNewButton.setBounds(111, 106, 207, 42);
		contentPane.add(btnNewButton);
	}
}
