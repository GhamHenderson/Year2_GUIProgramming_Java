import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class lab8Part1 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
	
					lab8Part1 frame = new lab8Part1();
					frame.setVisible(true);
	}

	
	public lab8Part1() {
		
		setSize(500, 500);
		contentPane = new JPanel();
	
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel selectFileLabel = new JLabel("Show File Name : ");
		panel.add(selectFileLabel);
		
		JButton button1 = new JButton("Click Me");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				int optionVal=fileChooser.showOpenDialog(contentPane);
				
				if (optionVal == JFileChooser.APPROVE_OPTION) {
		            File file = fileChooser.getSelectedFile();
		            
					selectFileLabel.setText(file.getName());
		            System.out.println(file.getName());
		            
		            
		        } else {
		            System.out.println("No File");            
		        }	
				
			}
		});
		contentPane.add(button1);
	}

}
