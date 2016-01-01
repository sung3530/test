package sunghoProject.book;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class userJtable extends JFrame {
	String[] name={"Book Private Number","Title","Writer","Publisher","Year"};
	int i;
	   public DefaultTableModel model_user = new DefaultTableModel(name, 0);
	   public JTable table_user=new JTable(model_user)
	   {
	      public boolean isCellEditable(int rowIndex,int colIndex)
	      {
	         return false;
	      }
	   };   
	public userJtable(Object[][] data){
		super("User Book List");
		i=0;
		
		while(data[i][0]!=null){
		model_user.addRow(data[i]);
		i++;
		}
		
		
		
		
		add(new JScrollPane(table_user),BorderLayout.CENTER);
		setSize(500,200);
		setVisible(true);
		
		
	}
}
