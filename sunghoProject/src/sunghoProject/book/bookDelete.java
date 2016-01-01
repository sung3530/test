package sunghoProject.book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

import sunghoProject.write;

public class bookDelete {
	private
		String input;
		boolean checkUser=false;
		String[] sum=new String[100];
		int i;
		write bw=new write();
		read br=new read();
	public void find(String bpn,String tt){
		String[] tmp=br.Read("book.txt");
		for (int i = 0; i < tmp.length; i++) {
			String[] temp=tmp[i].split(":");
			if(temp[0].compareTo(bpn)==0&&temp[2].compareTo(tt)==0){
				this.checkUser=true;
			}
			else{
				sum[i]=input;
			}
		}
	}
	public void delete(){
		if(this.checkUser==true){
			i=0;
				do{
					String[] temp=sum[i].split(":");
					bw.setContents(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
					if(i==0)
					bw.Write("book.txt",false);
					else
						bw.Write("book.txt",true);
					i++;
				}while(sum[i]!=null);
		}
		else{
			JOptionPane.showMessageDialog(null, "The book is not find.", "Delete System", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
