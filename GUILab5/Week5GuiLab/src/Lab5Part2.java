
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;


public class Lab5Part2 extends JFrame implements ActionListener {
	



	public static void main(String[] args) {

			Lab5Part2 frame = new Lab5Part2();
			frame.setVisible(true);
					
	}
	
	
	JPanel contentPane = new JPanel();
	//JMenu
	JMenuBar Networks = new JMenuBar();
	JMenuItem ThreeNetwork = new JMenuItem("ThreeNetwork");
	JMenuItem Eir = new JMenuItem("Eir");
	JMenuItem Vodafone = new JMenuItem("Vodafone");
	JMenu menu = new JMenu("Mobile Networks", true);
	JLabel label = new JLabel();

	
	public Lab5Part2() {
		setSize(900,900);
		contentPane.add(label);
		Networks.add(menu);
		setJMenuBar(Networks);
		contentPane.add(label);
	
		menu.add(ThreeNetwork);
		menu.add(Eir);
		menu.add(Vodafone);
	
		
		
		//MB Action Listener
		ThreeNetwork.addActionListener(this);
		Eir.addActionListener(this);
		Vodafone.addActionListener(this);
		
		getContentPane().add(label, BorderLayout.CENTER);
		
	}
	
	public void actionPerformed(ActionEvent e) {
	
			if (e.getSource() == ThreeNetwork) {
				System.out.println("Hello");
				label.setIcon(new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Three.png"));
			}
			else if (e.getSource() == Eir) {
				label.setIcon(new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Eir.jpg"));
			}
			else if (e.getSource() == Vodafone) {
				label.setIcon(new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week5GuiLab\\src\\Vodafone.gif"));
			}
		}
	}
