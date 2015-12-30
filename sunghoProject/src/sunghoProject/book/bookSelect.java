package sunghoProject.book;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class bookSelect extends JFrame implements ActionListener {
	private
		JPanel center=new JPanel();
		JPanel south=new JPanel();
		JPanel jp=new JPanel();
		JTextField tf=new JTextField();
		JLabel jl=new JLabel();
		JButton[] jb= new JButton[2];
		String[] buttons={"Borrow","Cancel"};
		bookBorrow bb;
		
	public bookSelect(bookBorrow bd){
		super("InPut Book");
		this.bb=bd;
		jl=new JLabel("Private Book Number : ");
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb[0])){
			bb.checkbook(tf.getText());
			dispose();
		}
		else if(e.getSource().equals(jb[1]))
			dispose();
	}
}
