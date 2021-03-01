package week3GUI;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class Week3Part4 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {

					Week3Part4 frame = new Week3Part4();
					frame.setVisible(true);
	}

	public Week3Part4() {

		setSize(1200, 1200);
		setTitle("ATM Machine");
		contentPane = new JPanel();
		
		JPanel panel = new JPanel();
		
		// I want to use the absoloute value layout manager.
		panel.setBounds(10, 172, 1164, 397);
		
		// Panel
		setContentPane(panel);
		panel.setLayout(null);
		
		
		//Button List
		JLabel topLogo = new JLabel("Bank Of Ireland");
		topLogo.setIcon(new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\week3GUI\\src\\week3GUI\\bank.jpg"));
		topLogo.setBounds(10, 11, 1164, 150);
		panel.add(topLogo);
		
		JButton cashOut = new JButton("Cash Withdrawal");
		cashOut.setBounds(10, 183, 329, 84);
		panel.add(cashOut);
		
		JButton cardSettings = new JButton("Card Settings");
		cardSettings.setBounds(10, 278, 329, 84);
		panel.add(cardSettings);
		
		JButton pinChange = new JButton("Change PIN");
		pinChange.setBounds(10, 378, 329, 84);
		panel.add(pinChange);
		
		JButton balanceCheck = new JButton("Check Balance");
		balanceCheck.setBounds(837, 183, 337, 84);
		panel.add(balanceCheck);
		
		JButton quickWithdrawal = new JButton("Quick Withdrawal £20");
		quickWithdrawal.setBounds(837, 278, 337,84);
		panel.add(quickWithdrawal);
		
		JButton exitSys = new JButton("Exit");
		exitSys.setBounds(837, 378, 337, 84);
		panel.add(exitSys);
		
		// Footer Image
		JLabel bottomLogo = new JLabel("                                                                                            Thank You for using Bank Of Ireland, Have a good day.");
		bottomLogo.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		bottomLogo.setBackground(Color.blue);
		bottomLogo.setBounds(10, 473, 1164, 56);
		panel.add(bottomLogo);
		

	}

}
