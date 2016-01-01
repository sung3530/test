package sunghoProject.book;

import java.io.BufferedReader;
import java.io.FileReader;

public class read {
	String input;
	String[] sum=new String[1000];
	int j;
	public String[] extendArray(String[] list, int pcount2) { 
		String[] tempList = new String[pcount2]; 
		for (int i = 0; i < pcount2; i++) { 
			tempList[i] = list[i]; 
	    } 
		  return tempList; 
		} 

	public String[] Read(String files){
		try{
			FileReader fr=new FileReader(files);
			BufferedReader bf=new BufferedReader(fr);
			j=0;
			while((input=bf.readLine())!=null){
				sum[j]=input;
				j++;
			}
			bf.close();
			}catch(Exception E){
				
			}
		return this.extendArray(sum, j);
	}
}
