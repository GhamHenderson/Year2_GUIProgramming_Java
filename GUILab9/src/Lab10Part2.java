import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Lab10Part2 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
	
					Lab10Part2 frame = new Lab10Part2();
					frame.setVisible(true);
					

	}


	public Lab10Part2() {
		setSize(400,400);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.black);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.white);
		g.fillRoundRect(200, 280, 100, 100,100, 100);
		g.setColor(Color.red);
		g.fillRoundRect(205, 210, 80,80,80,80);
		
		g.setColor(Color.white);
		g.fillRoundRect(205, 210, 80,80,80,80);
		g.fillRoundRect(215, 160, 60,60,60,60);
		g.setColor(Color.yellow);
		g.fillRect(210, 150, 70, 20);
		g.fillRect(225, 110, 40,50);
		g.setColor(Color.orange);
		g.fillRoundRect(240, 190, 30, 10,10, 10);
	    g.setColor(Color.black);
	    g.fillRoundRect(225, 175, 10, 10,10, 10);
	    g.fillRoundRect(255, 175, 10, 10,10, 10);
	    g.setColor(Color.white);
	    g.fillRoundRect(200, 105, 10, 10,10, 10);
	    g.fillRoundRect(240, 75, 10, 10,10, 10);
	    g.fillRoundRect(180, 135, 10, 10,10, 10);
	    g.fillRoundRect(240,240, 10, 10,10, 10);
	    g.fillRoundRect(120,240, 10, 10,10, 10);
	    g.fillRoundRect(100,180, 10, 10,10, 10);
	    g.setColor(Color.green);
		g.fillRoundRect(235, 240,20,20,20,20);
		g.fillRoundRect(235, 300,20,20,20,20);
	   } 
}
