import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Lab9Part2 extends JFrame {

	private JPanel contentPane;
	public String selection;
	
	
	public static void main(String[] args) {

					Lab9Part2 frame = new Lab9Part2();
					frame.setVisible(true);
					frame.setTitle("Grahams Program");
	}

	JLabel label = new JLabel("");
	JButton button1 = new JButton("Show Message Dialog");
	
	public Lab9Part2() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMenu();
		
			}
		});
		
		contentPane.setLayout(new GridLayout(2,1));
		
		
		contentPane.add(label);
		contentPane.add(button1);
		
	}
	
	
	public String showMenu(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Object[] options = {"Football", "Running", "Gaelic", "Hurling", "Boxing"};

        Object selectionObject = JOptionPane.showInputDialog(frame, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String selectionString = selectionObject.toString();
        
        
        if(selectionString == "Football") {
			label.setIcon(new ImageIcon("img/football.jpg"));
			JOptionPane.showMessageDialog(frame, "football", "football",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/football.jpg"));
		}
        else if(selectionString == "Running") {
			label.setIcon(new ImageIcon("img/running.jpg"));
			JOptionPane.showMessageDialog(frame, "running", "running",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/running.jpg"));
		}
        else if(selectionString == "Gaelic") {
			label.setIcon(new ImageIcon("img/gaelic.jpg"));
			JOptionPane.showMessageDialog(frame, "gaelic", "gaelic",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/gaelic.jpg"));
		}
        else if(selectionString == "Hurling") {
			label.setIcon(new ImageIcon("img/hurling.jpg"));
			JOptionPane.showMessageDialog(frame, "hurling", "hurling",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/hurling.jpg"));
		}
        else if(selectionString == "Boxing") {
			label.setIcon(new ImageIcon("img/boxing.jpg"));
			JOptionPane.showMessageDialog(frame, "boxing", "boxing",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/boxing.jpg"));
		}
        return selectionString;
    }
	

		  }




