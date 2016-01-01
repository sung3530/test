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
	private write bw=new write();
	
	public void setContent(String id,String pw,String na,String ag,String pn,String sc){
		this.id=id;
		this.pw=pw;
		this.name=na;
		this.age=ag;
		this.pn=pn;
		this.school=sc;
	}
	
	public void joinRegister(){
		bw.setContents(this.id, this.pw, this.name, this.age, this.pn, this.school);
		bw.Write("manager.txt", true);
	}
	
}
