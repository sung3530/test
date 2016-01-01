package sunghoProject;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

import sunghoProject.book.read;

public class loginCheck {
	private
		String input;
		read rr=new read();
	public boolean find(String id,String pw){
		String[] tmp=rr.Read("manager.txt");
		for (int i = 0; i < tmp.length; i++) {
			String[] temp=tmp[i].split(":");
			if(temp[0].compareTo(id)==0&&temp[1].compareTo(pw)==0){
				return true;
			}
		}
		return false;
	}
}
