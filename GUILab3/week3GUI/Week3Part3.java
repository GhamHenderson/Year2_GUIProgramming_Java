package week3GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;


@SuppressWarnings("serial")
public class Week3Part3 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {

					Week3Part3 frame = new Week3Part3();
					frame.setVisible(true);

	}

	
	public Week3Part3() {
		
		
		String[] Brands = {"Nike","Umbro","Adidas","Puma"};
		String[] Countries = {"Africa","England","Ireland","China","America","France"};
		
		
		setSize(800, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> comboBox1 = new JComboBox<String>(Brands);
		comboBox1.setBounds(97, 141, 530, 54);
		
		contentPane.add(comboBox1);
		
		JComboBox <String> comboBox2 = new JComboBox<String>(Countries);
		comboBox2.setBounds(97, 46, 530, 54);
		comboBox2.setEditable(true);
		contentPane.add(comboBox2);
	}
}
