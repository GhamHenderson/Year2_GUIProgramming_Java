import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;

public class Lab8Part4 extends JFrame {

	private JPanel contentPane;
	JLabel imageLabel = new JLabel("imageLabel");
	JPanel topRight = new JPanel();
	JPanel bottomLeft = new JPanel();
	JLabel locationLabel = new JLabel("location label");
	JPanel bottomRight = new JPanel();
	JLabel infoLabel = new JLabel("infoLabel");
	JPanel topLeft = new JPanel();
	private final Button changeColor = new Button("Change Color");
	
	
	public static void main(String[] args) {
	
					Lab8Part4 frame = new Lab8Part4();
					frame.setVisible(true);
			
	}

	
	public Lab8Part4() {
		setSize(600, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2,2));
		topLeft.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int optionVal=fileChooser.showOpenDialog(contentPane);
				
				if (optionVal == JFileChooser.APPROVE_OPTION) {
		            File file = fileChooser.getSelectedFile();
		            imageLabel.setIcon(new ImageIcon(file.getName()));
		            
		        } else {
		            System.out.println("No File");            
		        }
			}
		});
		
	
		topLeft.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(topLeft);
		imageLabel.setVerticalAlignment(SwingConstants.TOP);
		
		topLeft.add(imageLabel);
		
	
		topRight.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(topRight);
		changeColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color chosenColor = JColorChooser.showDialog(topRight, "Left Button", Color.BLACK);
				topRight.setBackground(chosenColor);
			}
		});
		changeColor.setActionCommand("colorchanger");
		
		topRight.add(changeColor);
		bottomLeft.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				locationLabel.setText("Mouse Dragged " + e.getX() + " " + e.getY());
			}
		});
		
		bottomLeft.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(bottomLeft);
	
		bottomLeft.add(locationLabel);
		bottomRight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				infoLabel.setText("Slan Abhaile!, luch!!!");
			}
		});
		
		bottomRight.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(bottomRight);
		

		bottomRight.add(infoLabel);
		
		
	}

	public void mouseEntered(MouseEvent e) {
		locationLabel.setText("Mouse Entered Event");
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Enter");
		}		
	}

}
