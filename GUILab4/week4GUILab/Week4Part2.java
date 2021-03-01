package week4GUILab;


import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Week4Part2 extends JFrame {

	JLabel outputLabel = new JLabel("Message appears here");
	
	public static void main(String[] args) {

					Week4Part2 frame = new Week4Part2();
					frame.setVisible(true);
	}

	public Week4Part2() {
		String[] colors = {"Red", "Black", "Blue", "Green", "Yellow"};
		setSize(800, 800);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JList<String> colourSelected = new JList<String>(colors);
		panel.add(colourSelected);
		panel.add(outputLabel, BorderLayout.SOUTH);
		
		JButton mybutton = new JButton("Change");
		panel.add(mybutton);
		
		mybutton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
			String selectedColor = (String) colourSelected.getSelectedValue();
			
			if(selectedColor == "Red") {
				outputLabel.setText("Red Selected");
				panel.setBackground(Color.red);
			}
			else if(selectedColor == "Black") {
				outputLabel.setText("Black Selected");
				panel.setBackground(Color.BLACK);
			}
			else if(selectedColor == "Blue") {
				outputLabel.setText("Blue Selected");
				panel.setBackground(Color.BLUE);
			}
			else if(selectedColor == "Green") {
				outputLabel.setText("Green Selected");
				panel.setBackground(Color.GREEN);
			}
			else if(selectedColor == "Yellow") {
				outputLabel.setText("Yellow Selected");
				panel.setBackground(Color.YELLOW);
			}
			
			}
		});
		
	
		
	}
	
}
