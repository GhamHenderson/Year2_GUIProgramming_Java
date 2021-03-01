import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Lab7Part2 extends JFrame {

	JDesktopPane desktop = new JDesktopPane(); 
    public Lab7Part2() {

        super("Internal Frame Demo");

        setContentPane(desktop); 
        setSize(640,480);
        setVisible(true);
        
        InternalFrameCreate();
    }

    public void InternalFrameCreate() {
    	int TotalFrames = 30;
    	JInternalFrame[] InternalFrameArray = new JInternalFrame[TotalFrames];
    	int x = 0;
    	int y = 0;
    	
    	
    	for (int i=0 ; i < TotalFrames; i++)
    	{
    		InternalFrameArray[i] = new JInternalFrame("Internal Window " + i ,true,false, true, false);
    		InternalFrameArray[i].setVisible(true);
    		InternalFrameArray[i].setSize(300,300);
    		InternalFrameArray[i].setLocation(x, y);
    		desktop.add(InternalFrameArray[i]);
    		x += 5;
    		y += 5;	
    		
    	}
    }
    
    public static void main(String[] args) {

        Lab7Part2 frame = new Lab7Part2();

    }
}
