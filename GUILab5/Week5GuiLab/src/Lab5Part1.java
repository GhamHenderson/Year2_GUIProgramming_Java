
import java.awt.MenuBar;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;


public class Lab5Part1 extends JFrame {
	
	private JPanel contentPane;


	public static void main(String[] args) {

					Lab5Part1 frame = new Lab5Part1();
					frame.setVisible(true);
					MenuBar myMenuBar = new MenuBar();
	}


	public Lab5Part1() {
		setSize(900,900);
		contentPane = new JPanel();
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu Ulster = new JMenu("Ulster", true);
		JMenu Munster = new JMenu("Munster", true);
		JMenu Leinster = new JMenu("Leinster", true);
		JMenu Connaght = new JMenu("Connaght", true);
		
		mb.add(Ulster );
		mb.add(Munster);
		mb.add(Leinster);
		mb.add(Connaght);
		
		Icon icon1 = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Ulster.png");
		Icon icon2 = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Munster.png");
		Icon icon3 = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Leinster.png");
		Icon icon4 = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Connaght.png");
		
		Ulster.setIcon(icon1);
		Munster.setIcon(icon2);
		Leinster.setIcon(icon3);
		Connaght.setIcon(icon4);
		
		}
}
