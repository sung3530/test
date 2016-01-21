package multyChatting;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinGui extends JFrame implements ActionListener {
	private
		JPanel south=new JPanel();
		JPanel center=new JPanel();
		JPanel[] textJPanel=new JPanel[4];
		String[] textTitle={"ID : ","PW : ","Name : ","PhoneNumber : "};
		String[] button={"Create","Cancer"};
		JTextField[] tf=new JTextField[4];
		JLabel[] jl=new JLabel[4];
		JButton[] jb=new JButton[2];
		
		public JoinGui(){
			super("Chatting Join System");
			textFieldGenerate();
			buttonGenerate();
			GuiGenerate();
		}
		private void textFieldGenerate(){
			for (int i = 0; i < textTitle.length; i++) {
				jl[i]=new JLabel(textTitle[i]);
				tf[i]=new JTextField(15);
				textJPanel[i]=new JPanel();
				textJPanel[i].add(jl[i]);
				textJPanel[i].add(tf[i]);
				center.add(textJPanel[i]);
			}
		}
		private void buttonGenerate(){
			for (int j = 0; j < button.length; j++) {
				jb[j]=new JButton(button[j]);
				south.add(jb[j]);
				jb[j].addActionListener(this);
			}
		}
		private void GuiGenerate(){
			add(center,BorderLayout.CENTER);
			add(south,BorderLayout.SOUTH);
			setBounds(300,300,300,250);
			setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(jb[0])){
				
			}
			else if(e.getSource().equals(jb[1])){
				dispose();
			}
		}
		
}
