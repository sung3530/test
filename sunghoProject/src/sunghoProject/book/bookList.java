package sunghoProject.book;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class bookList extends bookAdd {
	private
	String sum="Book List\n";;
	String input;
	
	public void print(){
		try{
			String sum="Book List\n";
			FileReader fr=new FileReader("book.txt");
			BufferedReader bf=new BufferedReader(fr);
			while((input=bf.readLine())!=null){
				String[] temp=input.split(":");
				sum=sum+"Private Number : "+temp[0]+"/ Title : "+temp[2]+"/ Writer : "+temp[3]+"/ Publisher : "+temp[4]+"/ Year : "+temp[5]+"\n";
				}
			bf.close();
			JOptionPane.showMessageDialog(null, sum, "Book List", JOptionPane.INFORMATION_MESSAGE);
			}catch(Exception E){
			}
	}
	public void notBorrow(){
		try{
			String sum="Book List\n";
			FileReader fr=new FileReader("book.txt");
			BufferedReader bf=new BufferedReader(fr);
			while((input=bf.readLine())!=null){
				String[] temp=input.split(":");
				if(temp[1].compareTo("1")==0){
				sum=sum+"Private Number : "+temp[0]+"/ Title : "+temp[2]+"/ Writer : "+temp[3]+"/ Publisher : "+temp[4]+"/ Year : "+temp[5]+"\n";
				}
				}
			bf.close();
			JOptionPane.showMessageDialog(null, sum, "Book List", JOptionPane.INFORMATION_MESSAGE);
			}catch(Exception E){
			}
		
		
	}
	public void userBookList(String numb){
		try{
			String sum="Borrow Book List\n";
			FileReader fr=new FileReader("book.txt");
			BufferedReader bf=new BufferedReader(fr);
			while((input=bf.readLine())!=null){
				String[] temp=input.split(":");
				if(temp[1].compareTo(numb)==0){
				sum=sum+"Book Private Number : "+temp[0]+"/ Title : "+temp[2]+"/ Writer : "+temp[3]+"/ Publisher : "+temp[4]+"/ Year : "+temp[5]+"\n";
				}
				}
			bf.close();
			JOptionPane.showMessageDialog(null, sum, "Book List", JOptionPane.INFORMATION_MESSAGE);
			}catch(Exception E){
			}
		
	}
}
