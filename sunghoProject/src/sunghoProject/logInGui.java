package sunghoProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class logInGui extends JFrame implements ActionListener {
	private
		JPanel center = new JPanel();
		JPanel south= new JPanel();
		String[] contents={"ID : ","PW : "};
		String[] buttons={"Log In","Join"};
		JLabel[] jl=new JLabel[2];
		JPanel[] jp=new JPanel[2];
		JTextField[] tf=new JTextField[2];
		JButton[] jb=new JButton[2];
		loginCheck lic=new loginCheck();
		
	public logInGui(){
		super("Manager Log In");
		tf[0]=new JTextField(15);
		tf[1]=new JPasswordField(15);
		for (int i = 0; i < contents.length; i++) {
			jl[i]=new JLabel(contents[i]);
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
		setBounds(300,300,400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb[0]))
		{
			if(lic.find(tf[0].getText(), tf[1].getText())==true){
				mainGui mg=new mainGui();
				dispose();
			}
			else{
				JOptionPane.showMessageDialog(null, "Your ID or PASSWORD is INCORRECT.", "Log In Faill", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(e.getSource().equals(jb[1]))
		{
			joinGui jg=new joinGui();
		}
		
	}
;	
}
