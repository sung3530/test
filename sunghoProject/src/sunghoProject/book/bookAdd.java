package sunghoProject.book;

import java.io.BufferedWriter;
import java.io.FileWriter;

import sunghoProject.write;
import sunghoProject.privateNumberGenerate;

public class bookAdd {
		String privateNumber;
		protected String title;
		protected String Writer;
		protected String Publisher;
		protected String Year;
		privateNumberGenerate png=new privateNumberGenerate();
		write bw=new write();
	public void setContents(String tt,String wt,String pb,String Ye){
		this.title=tt;
		this.Writer=wt;
		this.Publisher=pb;
		this.Year=Ye;
	}
	public void addBook(){
		while(privateNumber==null){
			privateNumber=png.generateNumber("book.txt");
			}
		bw.setContents(this.privateNumber, "1", this.title, this.Writer, this.Publisher, this.Year);
		bw.Write("book.txt",true);
	}
}
