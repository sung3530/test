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
		try{
		FileWriter fw = new FileWriter("user.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		while(privateNumber==null){
		privateNumber=png.generateNumber("user.txt");
		}
		bw.write(this.privateNumber);
		bw.write(":");
		bw.write(this.name);
		bw.write(":");
		bw.write(this.age);
		bw.write(":");
		bw.write(this.phoneNumber);
		bw.write(":");
		bw.write(this.homeAddress);
		bw.newLine();
		bw.close();
		}catch(Exception E){
			
		}
	}
}
