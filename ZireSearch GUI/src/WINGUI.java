import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class WINGUI {
	String message= new String();
	
	WINGUI(){
		message= "WIN";
	}
	public void me(){
	  JOptionPane.showMessageDialog(null, "YOU ARE WINNER!!", "Game over", JOptionPane.INFORMATION_MESSAGE);
	}
}
