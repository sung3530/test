package sunghoProject;

import java.io.BufferedWriter;
import java.io.FileWriter;

import sunghoProject.book.bookAdd;

public class write {
	private String privateNumber;
		String borrowName;
		String title;
		String Writer;
		String Publisher;
		String Year;
	public void setContents(String pn, String bn,String tt,String wt,String pb,String Ye){
		this.privateNumber=pn;
		this.borrowName=bn;
		this.title=tt;
		this.Writer=wt;
		this.Publisher=pb;
		this.Year=Ye;
	}
	
	public void Write(String fil,boolean x){
		try{
			FileWriter fw = new FileWriter(fil,x);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(this.privateNumber);
			bw.write(":");
			bw.write(this.borrowName);
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

	public void userWrite(String pvn,String nam,String age,String ph,String hoa){
		try{
			FileWriter fw = new FileWriter("user.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(pvn);
			bw.write(":");
			bw.write(nam);
			bw.write(":");
			bw.write(age);
			bw.write(":");
			bw.write(ph);
			bw.write(":");
			bw.write(hoa);
			bw.newLine();
			bw.close();
			}catch(Exception E){
				
			}
	}
}
