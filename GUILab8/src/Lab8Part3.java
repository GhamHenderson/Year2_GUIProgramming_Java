
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.*;

public class Lab8Part3 extends JFrame implements MouseInputListener {

	JPanel mousePanel, actionsPanel;
	JLabel mouseLabel;

	
	public Lab8Part3() {
		

		buildGUI();
		buildActionsPanel();
		mousePanel.setLayout(new GridLayout(0, 1, 0, 0));
		mousePanel.add(actionsPanel);
		mouseLabel = new JLabel();
		mouseLabel.setVerticalAlignment(SwingConstants.TOP);
		actionsPanel.add(mouseLabel);
		mouseLabel.setForeground(Color.BLACK);
		mouseLabel.setBorder(new LineBorder(Color.BLACK));
		mouseLabel.setText("Current Mouse Action Listed Here");
		getContentPane().add(mousePanel, BorderLayout.CENTER);
		
		setSize(800,400);
		setVisible(true);
		
	}
	
	public void buildGUI() {
		
		mousePanel = new JPanel();
		actionsPanel = new JPanel();
		actionsPanel.setLayout(new GridLayout(3,4));
		mousePanel.addMouseListener(this);
		mousePanel.addMouseMotionListener(this);
			
	}
	
	public void buildActionsPanel() {
	}
	
	
	public static void main(String[] args) {
		new Lab8Part3();
	}

	public void mouseClicked(MouseEvent e) {
		mouseLabel.setText("Mouse Click Event");
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Click\n" + e.getX() + " " + e.getY() + "\n" + " \nTop " + e.getXOnScreen() + " " + e.getYOnScreen());
		}
	}

	public void mouseEntered(MouseEvent e) {
		mouseLabel.setText("Mouse Entered Event");
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Enter");
		}		
	}

	public void mouseExited(MouseEvent e) {
		mouseLabel.setText("Mouse Exit Event");
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Exit");
		}		
	}

	public void mousePressed(MouseEvent e) {
		mouseLabel.setText("Mouse Pressed Event");
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Pressed");
		}		
	}

	public void mouseReleased(MouseEvent e) {
		mouseLabel.setText("Mouse Released Event");	
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Release");
		}		
	}

	public void mouseDragged(MouseEvent e) {
		mouseLabel.setText("Mouse Dragged " + e.getX() + " " + e.getY());	
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Drag");
		}		
	}

	public void mouseMoved(MouseEvent e) {
		mouseLabel.setText("Mouse Move " + e.getX() + " " + e.getY() );	
		if(e.getSource() instanceof JLabel) {
			((JLabel)e.getSource()).setText("Move");
		}		
	}
	
}
