package sunghoProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

import sunghoProject.book.read;

public class returnBook {
	boolean ch;
	String input;
	String[] sum=new String[100];
	private write bw=new write();
	private read br=new read();
	public void checkbook(String numb){
		try{
			ch=false;
			String[] tmp=br.Read("book.txt");
			for (int i = 0; i < tmp.length; i++) {
				String[] divd=tmp[i].split(":");
				if(divd[0].compareTo(numb)==0){
					sum[i]=divd[0]+":"+"1"+":"+divd[2]+":"+divd[3]+":"+divd[4]+":"+divd[5];
					ch=true;
				}
				else{
					sum[i]=input;
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
