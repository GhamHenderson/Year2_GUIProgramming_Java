
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Lab5Part4 extends JFrame {

	private JPanel contentPane;
	double balance = 150.00;
	String balanceCall = "your balance is : ";
	JLabel bottomLogo = new JLabel(balanceCall + balance);
	private JTextField boiInfo;
	
	
	
	public static void main(String[] args) {

					Lab5Part4 frame = new Lab5Part4();
					frame.setVisible(true);
	}

	public Lab5Part4() {

		setSize(1200, 1200);
		setTitle("ATM Machine");
		contentPane = new JPanel();
		
		//Set Up MenuBae
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// Put MenuBar Button into the frame
		JMenu menu = new JMenu("Bank of Ireland Settings");
		menuBar.add(menu);
		
		// Item 1 plus Accelerator
		JMenuItem menuItem1 = new JMenuItem("Bank Balance");
		menuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bottomLogo.setVisible(true);
				bottomLogo.setText("Your new balance is : " + balance);
			}
		});
		menu.add(menuItem1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
		
		// Item 3 plus Accelerator
		JMenuItem menuItem2 = new JMenuItem("Bank Information");
		menuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boiInfo.setVisible(true);
			}
		});
		menu.add(menuItem2);	
		menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.CTRL_MASK));
		
		// Item 3 plus Accelerator and Mnemonic
		JMenuItem menuItem3 = new JMenuItem("Deposit Money");
		menu.add(menuItem3);
		menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,ActionEvent.CTRL_MASK));
		menuItem3.setMnemonic('H');
		
		
		JPanel panel = new JPanel();
		setContentPane(panel);
		

		
		// I want to use the absoloute value layout manager.
		panel.setBounds(10, 172, 1164, 397);
		
		// Panel
		
		panel.setLayout(null);
		
		
		//Button List
		JLabel topLogo = new JLabel("Bank Of Ireland");
		topLogo.setIcon(new ImageIcon("C:\\Users\\Graha\\OneDrive\\Documents\\EclipseWorkspace\\Week5GuiLab\\img\\bank.jpg"));
		topLogo.setBounds(10, 11, 1164, 150);
		panel.add(topLogo);
		
		JButton cashOut = new JButton("Cash Withdrawal");
		cashOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				balance -= 50;
				bottomLogo.setText("Your new balance is : " + balance);
			}
		});
		cashOut.setBounds(10, 183, 329, 84);
		panel.add(cashOut);
		
		JButton selectChoice = new JButton("Bank Information");
		selectChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boiInfo.setVisible(true);
			}
		});
		selectChoice.setBounds(10, 278, 329, 84);
		panel.add(selectChoice);
		
		JButton pinChange = new JButton("Change PIN");
		pinChange.setBounds(10, 378, 329, 84);
		panel.add(pinChange);
		
		JButton balanceCheck = new JButton("Check Balance");
		balanceCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bottomLogo.setVisible(true);
			}
		});
		balanceCheck.setBounds(837, 183, 337, 84);
		panel.add(balanceCheck);
		
		JButton quickWithdrawal = new JButton("Quick Withdrawal £20");
		// Action Listener for quickWithdrawal.
		quickWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(balance >= 20) {
					balance -= 20;
					bottomLogo.setText("Your new Balance is : " + balance);
				}
				else {
					bottomLogo.setText("Insufficent Funds");
				}
			}
		});
		quickWithdrawal.setBounds(837, 278, 337,84);
		panel.add(quickWithdrawal);
		
		JButton exitSys = new JButton("Exit");
		exitSys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitSys.setBounds(837, 378, 337, 84);
		panel.add(exitSys);
		
		// Footer Image
		
		bottomLogo.setVisible(false);
		bottomLogo.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		bottomLogo.setBackground(Color.blue);
		bottomLogo.setBounds(10, 473, 1164, 56);
		panel.add(bottomLogo);
		
		boiInfo = new JTextField();
		boiInfo.setText("          Bank of Ireland, Main Street Finglas Village, Finglas, Dublin 11");
		boiInfo.setEditable(false);
		boiInfo.setVisible(false);
		
		boiInfo.setBounds(409, 183, 379, 178);
		panel.add(boiInfo);
		boiInfo.setColumns(10);
		

	}
}

