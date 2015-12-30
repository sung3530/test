package sunghoProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class joinGui extends JFrame implements ActionListener {
	private 
		JPanel center = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel south = new JPanel();
		String[] contents={"ID : ","PW : ","Name : ","Age : ","Phone Number : ","School"};
		String[] buttons={"Ok","Cancel"};
		JLabel[] jl=new JLabel[6];
		JTextField[] tf=new JTextField[6];
		JPanel[] jp=new JPanel[6];
		JButton[] jb=new JButton[2];
		join j=new join();
		
	public joinGui(){
		super("Join Gui");
		for (int i = 0; i < contents.length; i++) {
			jl[i]=new JLabel(contents[i]);
			tf[i]=new JTextField(15);
			jp[i]=new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			center.add(jp[i]);
		}
		for (int i = 0; i < buttons.length; i++) {
			jb[i]=new JButton(buttons[i]);
			south.add(jb[i]);
			jb[i].addActionListener(this);
		}
		add(center,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		
		setVisible(true);
		setBounds(300,300,300,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb[0])){
			j.setContent(tf[0].getText(), tf[1].getText(), tf[2].getText(), tf[3].getText(), tf[4].getText(), tf[5].getText());
			j.joinRegister();
			dispose();
		}
		else if(e.getSource().equals(jb[1])){
			dispose();
		}
		
	}
}
