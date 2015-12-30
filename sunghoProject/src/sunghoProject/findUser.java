package sunghoProject;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class findUser {
	String input;
	
	public void find(String name,String ph){
		try{
		FileReader fr=new FileReader("user.txt");
		BufferedReader bf=new BufferedReader(fr);
		while((input=bf.readLine())!=null){
			String[] temp=input.split(":");
			if(temp[1].compareTo(name)==0&&temp[3].compareTo(ph)==0){
				bf.close();
				JOptionPane.showMessageDialog(null, temp[0]+"\n is your Private Number", "Find Your number", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		bf.close();
		JOptionPane.showMessageDialog(null, "\n your name is not find", "Not Find Your number", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception E){
		}
		
	}
}
