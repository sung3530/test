package sunghoProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class returnBookGui extends JFrame implements ActionListener {
	private
		JPanel center=new JPanel();
		JPanel south=new JPanel();
		String contents="Private Book Number : ";
		String[] buttons={"Return","Cancel"};
		JPanel jp=new JPanel();
		JLabel jl=new JLabel();
		JTextField tf=new JTextField();
		JButton[] jb=new JButton[2];
		returnBook rb=new returnBook();
		
	public returnBookGui(){
		super("Return Book System");
		jl=new JLabel(contents);
		tf=new JTextField(15);
		jp=new JPanel();
		jp.add(jl);
		jp.add(tf);
		center.add(jp);
		
		for (int i = 0; i < buttons.length; i++) {
			jb[i]=new JButton(buttons[i]);
			south.add(jb[i]);
			jb[i].addActionListener(this);
		}
		
		add(center,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		
		setVisible(true);
		setBounds(300,300,400,150);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb[0])){
			rb.checkbook(tf.getText());
			dispose();
		}
		else if(e.getSource().equals(jb[1]))
			dispose();
	}
}
