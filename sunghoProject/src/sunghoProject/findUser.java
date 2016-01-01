package sunghoProject;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

import sunghoProject.book.read;

public class findUser {
	String input;
	private read rr=new read();
	public void find(String name,String ph){
		String[] tmp=rr.Read("user.txt");
		for (int i = 0; i < tmp.length; i++) {
			String[] temp=tmp[i].split(":");
			if(temp[1].compareTo(name)==0&&temp[3].compareTo(ph)==0){
				JOptionPane.showMessageDialog(null, temp[0]+"\n is your Private Number", "Find Your number", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "\n your name is not find", "Not Find Your number", JOptionPane.INFORMATION_MESSAGE);
	}
}
