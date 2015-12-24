import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class GUI extends JFrame{
	
	 
	private JPanel numPanel=new JPanel();
	private JButton []btn = new JButton[49];
	private GUIMAPCHECK ch = new GUIMAPCHECK();
	JButton[] getJButton(){
		return this.btn;
	}
	void setJButton(){
		
	}
	public GUI(int map[][],int checkMap[]){
		super("Áö·Ú Ã£±â");
		numPanel.setLayout(new GridLayout(7,7));
		for (int i = 0; i < 49; i++) {
			btn[i]=new JButton();
			numPanel.add(btn[i]);
		}
		for (int i = 0; i < 49; i++) {
			int count=i;
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					ch.checkMap(count, btn, map, checkMap);
				}
			});
		}
		
		add(numPanel,BorderLayout.CENTER);
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}