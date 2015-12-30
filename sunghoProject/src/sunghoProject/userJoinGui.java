package sunghoProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class userJoinGui extends JFrame implements ActionListener {
	private
		JPanel center=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel south=new JPanel();
		String[] contents={"Name : ","Age : ","Phone Number : ","Home Address"};
		String[] buttons={"OK","Cancel"};
		JLabel[] jl=new JLabel[4];
		JPanel[] jp=new JPanel[4];
		JTextField[] tf=new JTextField[4];
		JButton[] jb=new JButton[2];
		userJoin uj=new userJoin();
		
	public userJoinGui(){
		super("User Join Gui");
		for (int i = 0; i < contents.length; i++) {
			jl[i]=new JLabel(contents[i]);
			jp[i]=new JPanel();
			tf[i]=new JTextField(15);
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
		setBounds(300,300,300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb[0])){
			uj.setContent(tf[0].getText(), tf[1].getText(), tf[2].getText(), tf[3].getText());
			uj.joinRegister();
			JOptionPane.showMessageDialog(null, uj.getPrivateNumber()+"\nis your PrivateNumber", "User Private Number", JOptionPane.INFORMATION_MESSAGE);
			dispose();
		}
		else if(e.getSource().equals(jb[1])){
			dispose();
		}
	}

	
}
