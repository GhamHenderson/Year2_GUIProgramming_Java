import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab7Part4 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {

					Lab7Part4 frame = new Lab7Part4();
					frame.setVisible(true);

	}

	public Lab7Part4() {
		setSize(500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 264, 414, -252);
		contentPane.add(desktopPane);
		
		JDesktopPane mainDesktopPane = new JDesktopPane();
		mainDesktopPane.setSize(500,500);
		contentPane.add(mainDesktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 424, 22);
		mainDesktopPane.add(menuBar);
		
		JMenu select = new JMenu("Select Game");
		menuBar.add(select);
		
		JMenuItem XO = new JMenuItem("X's and O's");
		XO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JInternalFrame xando = new JInternalFrame("XO", true, false, true, false);
				JPanel panel = new JPanel();
				xando.add(panel);
				xando.setVisible(true);
				xando.setSize(300,300);
				xando.setLocation(10,10);
				mainDesktopPane.add(xando);
				
				panel.setLayout(new GridLayout(3,3));
				
				JButton btnNewButton_1 = new JButton("");
				panel.add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("");
				panel.add(btnNewButton_2);
				
				JButton btnNewButton_4 = new JButton("");
				panel.add(btnNewButton_4);
				
				JButton btnNewButton_3 = new JButton("");
				panel.add(btnNewButton_3);
				
				JButton btnNewButton = new JButton("");
				panel.add(btnNewButton);
				
				JButton btnNewButton_6 = new JButton("");
				panel.add(btnNewButton_6);
				
				JButton btnNewButton_5 = new JButton("");
				panel.add(btnNewButton_5);
				
				JButton btnNewButton_7 = new JButton("");
				panel.add(btnNewButton_7);
				
				JButton btnNewButton_8 = new JButton("");
				panel.add(btnNewButton_8);
				
			}
		});
		select.add(XO);
		
		JMenuItem sudoku = new JMenuItem("Sudoku");
		
		sudoku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JInternalFrame sudokuGame = new JInternalFrame("XO", true, false, true, false);
				JPanel panel1 = new JPanel();
				sudokuGame.add(panel1);
				panel1.setLayout(new GridLayout(9,9));
				sudokuGame.setVisible(true);
				sudokuGame.setSize(300,300);
				sudokuGame.setLocation(10,10);
				mainDesktopPane.add(sudokuGame);
				
				int TotalFrames = 81;
				JTextPane TextPane[] = new JTextPane[TotalFrames];
				
				for (int i=0 ; i < TotalFrames; i++)
				{
					TextPane[i] = new JTextPane();
					TextPane[i].setVisible(true);
					panel1.add(TextPane[i]);	
					TextPane[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
					
				}
				
			}
		});
		select.add(sudoku);
		
	}
}


