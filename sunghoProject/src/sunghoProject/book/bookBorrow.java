package sunghoProject.book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

import sunghoProject.write;

public class bookBorrow {
	String numbTemp;
	String input;
	String[] sum=new String[100];
	bookList bl=new bookList();
	boolean ch=false;
	private write bw=new write();
	private read br=new read();
	public void check(String numb, String name){
		numbTemp=numb;
		try{
			ch=false;
			String[] tmp=br.Read("user.txt");
			for (int i = 0; i < tmp.length; i++) {
				String[] temp=tmp[i].split(":");
				if(temp[0].compareTo(numb)==0&&temp[1].compareTo(name)==0){
					bookSelect bs=new bookSelect(this);
					bl.notBorrow();
					ch=true;
				}
			}
			if(ch==false)
			JOptionPane.showMessageDialog(null, "your name is not find", "Not Find Your number", JOptionPane.INFORMATION_MESSAGE);
			}catch(Exception E){
			}
	}
	public void checkbook(String numb){
		try{
			ch=false;
			String[] tmp=br.Read("book.txt");
			for (int i = 0; i < tmp.length; i++) {
				String[] temp=tmp[i].split(":");
				if(temp[0].compareTo(numb)==0){
					sum[i]=temp[0]+":"+numbTemp+":"+temp[2]+":"+temp[3]+":"+temp[4]+":"+temp[5];
					ch=true;
				}
				else{
					sum[i]=tmp[i];
				}
			}
			if(ch==false){
			JOptionPane.showMessageDialog(null, "your book is not find", "Not Find Your book", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				int order=0;
				while(sum[order]!=null){
					String[] temp=sum[order].split(":");
					bw.setContents(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
					if(order==0)
					bw.Write("book.txt",false);
					else
					bw.Write("book.txt",true);
					order++;
				}
				
			}
			}catch(Exception E){
			}
	}
}
