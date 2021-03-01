package week4GUILab;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Week4Part4 extends JFrame implements ActionListener {


	public static void main(String[] args) {

		Week4Part4 frame = new Week4Part4();
		frame.setVisible(true);

	}
	
	
	
	String[] topUpAmmount = {"5","10","20","30"};
	JPanel panel = new JPanel();
	Icon image = new ImageIcon("C:\\Users\\Graha\\eclipse-workspace\\Week4GUILab\\src\\week4GUILab\\three.png");
	JLabel threeImage = new JLabel(image);
	JButton topUpButton = new JButton("Top Up");
	JButton makeCallButton = new JButton("Make a Call");
	JButton sendTextButton = new JButton("Send a Text");
	JTextPane sendaTextfield = new JTextPane();
	JTextPane phoneNumberField = new JTextPane();
	JTextPane WelcomeMsg = new JTextPane();
	JComboBox combo = new JComboBox(topUpAmmount);

	private final JTextPane staticPhonenumber = new JTextPane();
	private final JTextPane balanceDisplay = new JTextPane();
	public int phoneCredit = 20;
	
	// Create Selection and Cast Selected item to String
	public String Selection = (String) combo.getSelectedItem();
	
	public Week4Part4() {
		// Window Size and Constraints
		setSize(1000,1000);
		setResizable(false);
		getContentPane().setLayout(null);
		// Panel
		panel.setBounds(-10, 0, 984, 984);
		getContentPane().add(panel);
		panel.setLayout(null);

		// Three Logo
		threeImage.setBounds(29, 11, 922, 266);
		panel.add(threeImage);
		
		
		// Top Up Button
		topUpButton.setBounds(83, 538, 215, 83);
		panel.add(topUpButton);
		
		
		
		
		//Action Listeners
		makeCallButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(phoneCredit >= 1) {
					phoneCredit -= 3;
					balanceDisplay.setText("Your Balance is € : " + phoneCredit);
				}
				else {
					balanceDisplay.setText("Not enough credit. Please Top Up");
					
				}
			}
		});
		
		// Make Call button
		 makeCallButton.setBounds(83, 350, 215, 83);
		 panel.add(makeCallButton);
		 sendTextButton.addActionListener(new ActionListener() {
			
			 
			 //Action Listener
			 @Override
			public void actionPerformed(ActionEvent e) {
				
				if(phoneCredit >= 1) {
					phoneCredit -= 1;
					balanceDisplay.setText("Your Balance is € : " + phoneCredit);
				}
				
				else {
					balanceDisplay.setText("Not enough credit. Please Top Up");
					
				}
				
			}
		});

		// Send a Text Button
		sendTextButton.setBounds(83, 444, 215, 83);
		panel.add(sendTextButton);

		// Text Field - Text
		sendaTextfield.setBounds(379, 444, 327, 83);
		panel.add(sendaTextfield);
		
		// Text Field - Phone Num
		phoneNumberField.setBounds(491, 400, 215, 33);
		panel.add(phoneNumberField);
		
		//Text Field - Welcome Msg
		WelcomeMsg.setEditable(false);
		WelcomeMsg.setFont(new Font("Milky Nice Clean", Font.PLAIN, 17));
		WelcomeMsg.setText("Three Network Ireland");
		WelcomeMsg.setBounds(389, 288, 193, 33);
		panel.add(WelcomeMsg);
	
		// Jcombo Box
		combo.setBounds(379, 538, 327, 83);
		panel.add(combo);
		
		// Text Field - Phone Num
		staticPhonenumber.setEditable(false);
		staticPhonenumber.setFont(new Font("Milky Nice Clean", Font.PLAIN, 12));
		staticPhonenumber.setText("Phone Number:");
		staticPhonenumber.setBounds(379, 400, 100, 33);
		panel.add(staticPhonenumber);
		
		// Balance Display
		balanceDisplay.setText("Your Balance is € : " + phoneCredit);
		balanceDisplay.setFont(new Font("Milky Nice Clean", Font.PLAIN, 12));
		balanceDisplay.setEditable(false);
		balanceDisplay.setBounds(379, 350, 327, 33);
		panel.add(balanceDisplay);
		
		
		
		// Action Listener Call
		topUpButton.addActionListener(this);
		
		}
	
		
		@Override
		public void actionPerformed(ActionEvent e) {
				Selection = (String) combo.getSelectedItem();
				
				if(Selection.equals("5")) {
					phoneCredit += 5;
					balanceDisplay.setText("Your Balance is € : " + phoneCredit);
					
				}
				else if(Selection.equals("10")) {
					phoneCredit += 10;
					balanceDisplay.setText("Your Balance is € : " + phoneCredit);
					
				}
				else if(Selection.equals("20")) {
					phoneCredit += 20;
					balanceDisplay.setText("Your Balance is € : " + phoneCredit);
					
				}
				else if(Selection.equals("30")) {
					phoneCredit += 30;
					balanceDisplay.setText("Your Balance is € : " + phoneCredit);
		}		
	}	
}