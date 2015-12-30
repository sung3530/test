package sunghoProject.book;

import java.io.BufferedWriter;
import java.io.FileWriter;

import sunghoProject.privateNumberGenerate;

public class bookAdd {
	private
		String privateNumber;
		String title;
		String Writer;
		String Publisher;
		String Year;
		privateNumberGenerate png=new privateNumberGenerate();
	public void setContents(String tt,String wt,String pb,String Ye){
		this.title=tt;
		this.Writer=wt;
		this.Publisher=pb;
		this.Year=Ye;
	}
	public void addBook(){
		try{
			FileWriter fw = new FileWriter("book.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			while(privateNumber==null){
				privateNumber=png.generateNumber("book.txt");
				}
			bw.write(this.privateNumber);
			bw.write(":");
			bw.write("1");
			bw.write(":");
			bw.write(this.title);
			bw.write(":");
			bw.write(this.Writer);
			bw.write(":");
			bw.write(this.Publisher);
			bw.write(":");
			bw.write(this.Year);
			bw.newLine();
			bw.close();
			}catch(Exception E){
				
			}
		
		
	}
}
