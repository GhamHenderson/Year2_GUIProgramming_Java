import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

/*
 * InternalFrameDemo.java
 *
 */

public class Lab7Part1 extends JFrame {



    public Lab7Part1() {

        super("Internal Frame Demo");

		//Set up the GUI.
        JDesktopPane desktop = new JDesktopPane(); //a specialized layered pane
        JInternalFrame innerframe = new JInternalFrame("Internal Window" ,
              										true, //resizable
              										false, //closable
              										true, //maximizable
              										false);//iconifiable

		innerframe.setSize(300,300);
		innerframe.setVisible(true); //necessary as of 1.3
        desktop.add(innerframe);
        innerframe.getContentPane().setLayout(null);
        
        JPanel leftpanel = new JPanel();
        leftpanel.setBackground(Color.RED);
        leftpanel.setBounds(0, 0, 137, 270);
        innerframe.getContentPane().add(leftpanel);
        
        JLabel LabelLeft = new JLabel("Left Panel");
        leftpanel.add(LabelLeft);
        
        JPanel rightpanel = new JPanel();
        rightpanel.setBackground(Color.YELLOW);
        rightpanel.setBounds(126, 0, 148, 270);
        innerframe.getContentPane().add(rightpanel);

        setContentPane(desktop); //important as it allows us to add items to the desktop
        setSize(640,480);
        setVisible(true);

    }


    public static void main(String[] args) {

        Lab7Part1 frame = new Lab7Part1();

    }
}


