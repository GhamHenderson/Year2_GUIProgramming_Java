import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class Lab5Part3 extends JFrame implements ActionListener{
	
	JMenuBar news = new JMenuBar();
	JMenuItem local = new JMenuItem("Local");
	JMenuItem international = new JMenuItem("international");
	JMenuItem weather = new JMenuItem("weather");
	JMenu menu = new JMenu("News", true);
	JLabel label = new JLabel();
	
	JTextArea text = new JTextArea(15, 69);
	JScrollPane scroll = new JScrollPane(text);
	
	
	
	public static void main(String[] args) {
					Lab5Part3 frame = new Lab5Part3();
					
	}
	
	
	
	public Lab5Part3() {
		text.setEditable(false);
		
		Container contentPane = getContentPane();
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//JPANEL
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		
		panel.add(news);
		panel.add(label);
		
		panel1.add(scroll);
		contentPane.add(panel);
		contentPane.add(panel1, BorderLayout.SOUTH);
		
		setVisible(true);
		
		setSize(800, 800);
		

		menu.add(local);
		menu.add(international);
		menu.add(weather);
		news.add(menu);
		
		local.addActionListener(this);
		international.addActionListener(this);
		weather.addActionListener(this);
		
		weather.setMnemonic('a');
		weather.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,
				ActionEvent.CTRL_MASK));
		international.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,
				ActionEvent.CTRL_MASK));
		local.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,
				ActionEvent.CTRL_MASK));
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == local) {
			label.setIcon(new ImageIcon("img\\statue.jpg"));
			text.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fermentum, diam ac vulputate aliquet, ligula sapien vehicula ligula, vel eleifend eros purus eget est. Suspendisse eu urna id nunc varius tincidunt. Aliquam molestie ullamcorper dui vitae finibus. Mauris semper mattis diam, nec mattis erat auctor nec. Quisque maximus, est sed facilisis facilisis, ipsum erat mattis dolor, ac venenatis enim dui id est. Donec in dolor ultricies, feugiat risus a, rhoncus ante. In at eros a odio posuere elementum at id ante. Pellentesque dictum ipsum ac varius aliquet. Curabitur quis semper nisi. In bibendum est nec elit pretium dictum ut a urna. Pellentesque non condimentum magna, vel ultricies diam. Sed porttitor velit metus, vel semper est elementum nec. Aenean at metus nec leo efficitur suscipit eget non ligula. Praesent vel blandit ex. Vestibulum efficitur feugiat erat, vel rutrum orci condimentum gravida.");
		}
		else if (e.getSource() == international) {
			label.setIcon(new ImageIcon("img\\trump.jpg"));
			text.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fermentum, diam ac vulputate aliquet, ligula sapien vehicula ligula, vel eleifend eros purus eget est. Suspendisse eu urna id nunc varius tincidunt. Aliquam molestie ullamcorper dui vitae finibus. Mauris semper mattis diam, nec mattis erat auctor nec. Quisque maximus, est sed facilisis facilisis, ipsum erat mattis dolor, ac venenatis enim dui id est. Donec in dolor ultricies, feugiat risus a, rhoncus ante. In at eros a odio posuere elementum at id ante. Pellentesque dictum ipsum ac varius aliquet. Curabitur quis semper nisi. In bibendum est nec elit pretium dictum ut a urna. Pellentesque non condimentum magna, vel ultricies diam. Sed porttitor velit metus, vel semper est elementum nec. Aenean at metus nec leo efficitur suscipit eget non ligula. Praesent vel blandit ex. Vestibulum efficitur feugiat erat, vel rutrum orci condimentum gravida.");
		}
		else if (e.getSource() == weather) {
			label.setIcon(new ImageIcon("img\\weather.jpg"));
			text.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fermentum, diam ac vulputate aliquet, ligula sapien vehicula ligula, vel eleifend eros purus eget est. Suspendisse eu urna id nunc varius tincidunt. Aliquam molestie ullamcorper dui vitae finibus. Mauris semper mattis diam, nec mattis erat auctor nec. Quisque maximus, est sed facilisis facilisis, ipsum erat mattis dolor, ac venenatis enim dui id est. Donec in dolor ultricies, feugiat risus a, rhoncus ante. In at eros a odio posuere elementum at id ante. Pellentesque dictum ipsum ac varius aliquet. Curabitur quis semper nisi. In bibendum est nec elit pretium dictum ut a urna. Pellentesque non condimentum magna, vel ultricies diam. Sed porttitor velit metus, vel semper est elementum nec. Aenean at metus nec leo efficitur suscipit eget non ligula. Praesent vel blandit ex. Vestibulum efficitur feugiat erat, vel rutrum orci condimentum gravida.");
		}
	}
}
