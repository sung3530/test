package sunghoProject.book;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class bookAddGui extends JFrame implements ActionListener {
	private
		JPanel center=new JPanel();
		JPanel south=new JPanel();
		String[] contents={"Title : ","Writer","Publisher","Year"};
		String[] buttons={"Ok","Cancel"};
		JLabel[] jl=new JLabel[4];
		JTextField[] tf=new JTextField[4];
		JPanel[] jp=new JPanel[4];
		JButton[] jb=new JButton[2];
		bookAdd ba=new bookAdd();
		
	public bookAddGui(){
		super("Book Add");
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
		setBounds(300,300,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb[0])){
			ba.setContents(tf[0].getText(), tf[1].getText(), tf[2].getText(), tf[3].getText());
			ba.addBook();
			dispose();
		}
		else if(e.getSource().equals(jb[1]))
			dispose();
	}
}
