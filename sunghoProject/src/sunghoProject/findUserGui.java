package sunghoProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class findUserGui extends JFrame implements ActionListener{
	private
		JPanel center=new JPanel();
		JPanel south=new JPanel();
		String[] contents={"Name : ","Phone Number : "};
		String[] buttons={"Find","Cancel"};
		JLabel[] jl=new JLabel[2];
		JTextField[] tf=new JTextField[2];
		JPanel[] jp=new JPanel[2];
		JButton[] jb=new JButton[2];
		findUser fu=new findUser();

	public findUserGui(){
		super("Find User");
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
		setBounds(300,300,300,200);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb[0])){
			fu.find(tf[0].getText(), tf[1].getText());
		dispose();
		}
		else if(e.getSource().equals(jb[1]))
			dispose();
	}
}
