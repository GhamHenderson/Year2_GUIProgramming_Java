import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Lab7Part3 extends JFrame {

	private JPanel contentPane;
	private final JDesktopPane desktopPane = new JDesktopPane();
	JLabel label1 = new JLabel("Font 1");
	JLabel label2 = new JLabel("Font 2");
	JLabel label3 = new JLabel();
	GridLayout layout = new GridLayout(0,2);
	public static void main(String[] args) {

					Lab7Part3 frame = new Lab7Part3();
					frame.setVisible(true);

	}

	public Lab7Part3() {
		setSize(450, 300);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		
		JMenuItem imageApp = new JMenuItem("imageApp");
		imageApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame imageApp = new JInternalFrame("Image App", true, false, true, false);
				imageApp.setVisible(true);
				imageApp.setSize(300,300);
				imageApp.setLocation(10,10);
				desktopPane.add(imageApp);
				imageApp.add(label3);
				Icon image = new ImageIcon("img/download.png");
				label3.setIcon(image);
			}
		});
		menu.add(imageApp);
		
		JMenuItem fontApp = new JMenuItem("fontApp");
		fontApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame fontApp = new JInternalFrame("Font App", true, false, true, false);
				fontApp.setVisible(true);
				fontApp.setSize(300,300);
				fontApp.setLocation(10,10);
				desktopPane.add(fontApp);
				fontApp.add(label1);
				fontApp.add(label2);
				fontApp.setLayout(layout);
				label1.setFont(new Font("Verdana", Font.PLAIN, 18));
				label2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			}
		});
		
		menu.add(fontApp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		desktopPane.setBounds(0, 0, 434, 261);
		contentPane.add(desktopPane);
	}
}
