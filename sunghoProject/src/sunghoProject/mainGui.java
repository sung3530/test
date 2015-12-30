package sunghoProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainGui extends JFrame implements ActionListener{
	private
		JPanel center=new JPanel();
		String[] buttons={"Borrow","Return","Book Add","Book Delete","Book List","User Join","Private Number Find","User Book List"};
		JButton[] jb=new JButton[8];
		
	public mainGui(){
		super("Main System");
		for (int i = 0; i < buttons.length; i++) {
			jb[i]=new JButton(buttons[i]);
			center.add(jb[i]);
			jb[i].addActionListener(this);
		}
		add(center,BorderLayout.CENTER);
		setVisible(true);
		setBounds(300,300,300,450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		center.setLayout(null);
		for (int i = 0; i <  jb.length; i++) {
			jb[i].setLocation(10,20+50*i);			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mainGuiController mgc=new mainGuiController(jb,e);
	}
}
