package sunghoProject;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class loginCheck {
	private
		
		String input;

	public boolean find(String id,String pw){
		try{
		FileReader fr=new FileReader("manager.txt");
		BufferedReader bf=new BufferedReader(fr);
		while((input=bf.readLine())!=null){
			String[] temp=input.split(":");
			if(temp[0].compareTo(id)==0&&temp[1].compareTo(pw)==0){
				return true;
			}
		}
		bf.close();
		return false;
		}catch(Exception E){
			
		}
		return false;
	}
}
