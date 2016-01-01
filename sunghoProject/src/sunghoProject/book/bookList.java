package sunghoProject.book;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class bookList extends bookAdd {
	private
	String sum="Book List\n";;
	String input;
	Object[][] data=new Object[100][5];
	int order;
	read br=new read();
	public void print(){
		String sum="Book List\n";
		String[] tmp=br.Read("book.txt");
		for (int i = 0; i < tmp.length; i++) {
			String[] temp=tmp[i].split(":");
			sum=sum+"Private Number : "+temp[0]+"/ Title : "+temp[2]+"/ Writer : "+temp[3]+"/ Publisher : "+temp[4]+"/ Year : "+temp[5]+"\n";
		}
		JOptionPane.showMessageDialog(null, sum, "Book List", JOptionPane.INFORMATION_MESSAGE);
	}
	public void notBorrow(){
		String sum="Book List\n";
		String[] tmp=br.Read("book.txt");
		for (int i = 0; i < tmp.length; i++) {
			String[] temp=tmp[i].split(":");
			if(temp[1].compareTo("1")==0){
				sum=sum+"Private Number : "+temp[0]+"/ Title : "+temp[2]+"/ Writer : "+temp[3]+"/ Publisher : "+temp[4]+"/ Year : "+temp[5]+"\n";
				}
		}
		JOptionPane.showMessageDialog(null, sum, "Book List", JOptionPane.INFORMATION_MESSAGE);
	}
	public void userBookList(String numb){
		order=0;
		String sum="Borrow Book List\n";
		String[] tmp=br.Read("book.txt");
		for (int i = 0; i < tmp.length; i++) {
			String[] temp=tmp[i].split(":");
			if(temp[1].compareTo(numb)==0){
				//sum=sum+"Book Private Number : "+temp[0]+"/ Title : "+temp[2]+"/ Writer : "+temp[3]+"/ Publisher : "+temp[4]+"/ Year : "+temp[5]+"\n";
					data[order][0]=temp[0];
					data[order][1]=temp[2];
					data[order][2]=temp[3];
					data[order][3]=temp[4];
					data[order][4]=temp[5];
					order++;
				}
		}
		userJtable uj=new userJtable(data);
		//JOptionPane.showMessageDialog(null, sum, "Book List", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
