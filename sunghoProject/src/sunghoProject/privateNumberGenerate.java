package sunghoProject;

import java.io.BufferedReader;
import java.io.FileReader;

import sunghoProject.book.read;

public class privateNumberGenerate {
	private
		int number;
		String exNumb;
		String input;
		read rr=new read();
	public String generateNumber(String file){
		String[] tmp=rr.Read(file);
		number=(int)(Math.random()*10000);
		exNumb = number+"";
		for (int i = 0; i < tmp.length; i++) {
			String[] temp=tmp[i].split(":");
			if(temp[0].compareTo(exNumb)==0){
				return null;
			}
		}
		return exNumb;
	}
}
