package sunghoProject;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class userJoin {
	String privateNumber=null;
	String name;
	String age;
	String phoneNumber;
	String homeAddress;
	privateNumberGenerate png=new privateNumberGenerate();
	private write w=new write();
	public void setContent(String id,String pw,String na,String ag){
		this.name=id;
		this.age=pw;
		this.phoneNumber=na;
		this.homeAddress=ag;
	}
	public String getPrivateNumber(){
		
		return privateNumber;
	}
	public void joinRegister(){
		privateNumber=null;
		while(privateNumber==null){
			privateNumber=png.generateNumber("user.txt");
			}
		w.userWrite(this.privateNumber, this.name, this.age, this.phoneNumber, this.homeAddress);
	}
}
