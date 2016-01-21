package multyChatting;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class logInGui extends JFrame implements ActionListener {
	private
		JPanel south=new JPanel();
		JPanel center=new JPanel();
		JPanel[] textJPanel=new JPanel[3];
		String[] textTitle={"ID : ","IP : ","PORT : "};
		String[] button={"Log In","Server Conection"};
		JTextField[] tf=new JTextField[3];
		JLabel[] jl=new JLabel[3];
		JButton[] jb=new JButton[2];
		
		public logInGui(){
			super("Chatting LogIn System");
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
			tf[1].setText("127.0.0.1");
			tf[2].setText("8000");
		}
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(jb[0])){
				ClientGui cg=new ClientGui(tf[0].getText(),tf[1].getText(),Integer.parseInt(tf[2].getText().trim()));
			}
			else if(e.getSource().equals(jb[1])){
				serverGui sg=new serverGui();
			}
			
		}
		
}
