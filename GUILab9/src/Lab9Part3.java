
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Lab9Part3 extends JFrame {

	private JPanel contentPane;
	JMenuBar menuBar = new JMenuBar();
	JMenu mnMenu = new JMenu("Menu");
	JMenuItem subjectChoice = new JMenuItem("Subject Choices");
	public String selectedSubject;
	Object[] options = {"maths","english","history"};
	
	public final String maths = (String) options[0];
	public final String english = (String) options[1];
	public final String history = (String) options[2];
	private final JLabel label = new JLabel();
	public int selection;
	public static void main(String[] args) {

					Lab9Part3 frame = new Lab9Part3();
					frame.setVisible(true);
	
	}

	public Lab9Part3() {
		
		setSize(600, 600);
		
		setJMenuBar(menuBar);
		menuBar.add(mnMenu);
		
		subjectChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showMenu();
				JOptionPane.showMessageDialog(label,selectedSubject);
				
			}
		});
		mnMenu.add(subjectChoice);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		contentPane.add(label);
	}
	
	public int showMenu(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        
        selection = JOptionPane.showOptionDialog(frame,"Menu","What is your favourite subject ?",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[2]);
        
        
        if(selection == JOptionPane.YES_OPTION) {
        	selectedSubject = maths;
        	
        }
        else if(selection== JOptionPane.NO_OPTION) {
        	selectedSubject = english;
        }
        else if(selection== JOptionPane.CANCEL_OPTION) {
         selectedSubject = history;
        }
		return selection;
        
        
    }
	
}
