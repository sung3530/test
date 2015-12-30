package sunghoProject;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class join {
	String id;
	String pw;
	String name;
	String age;
	String pn;
	String school;
	
	public void setContent(String id,String pw,String na,String ag,String pn,String sc){
		this.id=id;
		this.pw=pw;
		this.name=na;
		this.age=ag;
		this.pn=pn;
		this.school=sc;
	}
	
	public void joinRegister(){
		try{
		FileWriter fw = new FileWriter("manager.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(this.id);
		bw.write(":");
		bw.write(this.pw);
		bw.write(":");
		bw.write(this.name);
		bw.write(":");
		bw.write(this.age);
		bw.write(":");
		bw.write(this.pn);
		bw.write(":");
		bw.write(this.school);
		bw.newLine();
		bw.close();
		}catch(Exception E){
			
		}
	}
	
}
