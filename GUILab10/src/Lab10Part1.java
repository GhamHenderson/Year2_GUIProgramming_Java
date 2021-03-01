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

public class Lab10Part1 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
	
					Lab10Part1 frame = new Lab10Part1();
					frame.setVisible(true);
					

	}


	public Lab10Part1() {
		setSize(400,400);
		contentPane = new JPanel();
		setContentPane(contentPane);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		  int xValues[] = {160,220,280};
	      int yValues[] = {240,40,240};
	      g.setColor(Color.green);
	      Polygon poly = new Polygon(xValues,yValues,3);
	      g.fillPolygon(poly);
	      g.setColor(Color.getHSBColor(0, 74, 64));
	      g.fillRect( 200, 200, 50, 90);
	      g.setColor( Color.BLACK );
	      
	      g.setColor(Color.green);
	      g.fillRect(180, 140, 90, 100);
	      g.fillRect(205,70, 40,80);
	      
	      g.setColor(Color.red);
	      g.fillOval(205, 140, 20, 20);
	      g.fillOval(200, 100, 20, 20);
	      g.fillOval(245, 190, 20, 20);
	      g.setColor(Color.blue);
	      
	      g.fill3DRect( 100, 250, 55, 55, true );
	      g.setColor(Color.red);
	      g.fillOval(115, 230, 20, 20);
	     
	      g.fillOval(200, 200, 20, 20);
	      
	    
	   } 
}
