package sunghoProject.book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class bookBorrow {
	String numbTemp;
	String input;
	String[] sum=new String[100];
	bookList bl=new bookList();
	boolean ch=false;
	
	public void check(String numb, String name){
		numbTemp=numb;
		try{
			ch=false;
			FileReader fr=new FileReader("user.txt");
			BufferedReader bf=new BufferedReader(fr);
			while((input=bf.readLine())!=null){
				String[] temp=input.split(":");
				if(temp[0].compareTo(numb)==0&&temp[1].compareTo(name)==0){
					bookSelect bs=new bookSelect(this);
					bl.notBorrow();
					ch=true;
				}
			}
			bf.close();
			if(ch==false)
			JOptionPane.showMessageDialog(null, "your name is not find", "Not Find Your number", JOptionPane.INFORMATION_MESSAGE);
			}catch(Exception E){
			}
	}
	
	public void checkbook(String numb){
		int order=0;
		try{
			ch=false;
			
			FileReader fr=new FileReader("book.txt");
			BufferedReader bf=new BufferedReader(fr);
			while((input=bf.readLine())!=null){
				String[] temp=input.split(":");
				if(temp[0].compareTo(numb)==0){
					sum[order]=temp[0]+":"+numbTemp+":"+temp[2]+":"+temp[3]+":"+temp[4]+":"+temp[5];
					order++;
					ch=true;
				}
				else{
					sum[order]=input;
					order++;
				}
			}
			bf.close();
			if(ch==false){
			JOptionPane.showMessageDialog(null, "your book is not find", "Not Find Your book", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				try{
					FileWriter fw = new FileWriter("book.txt",false);
					BufferedWriter bw = new BufferedWriter(fw);
					order=0;
					while(sum[order]!=null){
					String[] temp=sum[order].split(":");
					bw.write(temp[0]);
					bw.write(":");
					bw.write(temp[1]);
					bw.write(":");
					bw.write(temp[2]);
					bw.write(":");
					bw.write(temp[3]);
					bw.write(":");
					bw.write(temp[4]);
					bw.write(":");
					bw.write(temp[5]);
					bw.newLine();
					order++;
					}
					bw.close();
					}catch(Exception E){
						
					}
				
				
			}
			}catch(Exception E){
			}
		
		
	}
}
