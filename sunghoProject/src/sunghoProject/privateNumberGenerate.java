package sunghoProject;

import java.io.BufferedReader;
import java.io.FileReader;

public class privateNumberGenerate {
	private
		int number;
		String exNumb;
		String input;
	public String generateNumber(String file){
	
		try{
			FileReader fr=new FileReader(file);
			BufferedReader bf=new BufferedReader(fr);
			number=(int)(Math.random()*10000);
			exNumb = number+"";
			while((input=bf.readLine())!=null){
				String[] temp=input.split(":");
				if(temp[0].compareTo(exNumb)==0){
					bf.close();
					return null;
				}
			}
			bf.close();
			return exNumb;
			}catch(Exception E){
				
			}
		
		return exNumb;
	}
}
