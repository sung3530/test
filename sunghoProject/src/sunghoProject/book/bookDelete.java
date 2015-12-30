package sunghoProject.book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class bookDelete {
	private
		String input;
		boolean checkUser=false;
		String[] sum=new String[100];
		int order;
		int i;
	public void find(String bpn,String tt){
		try{
			order=0;
			FileReader fr=new FileReader("book.txt");
			BufferedReader bf=new BufferedReader(fr);
			while((input=bf.readLine())!=null){
				String[] temp=input.split(":");
				if(temp[0].compareTo(bpn)==0&&temp[2].compareTo(tt)==0){
					this.checkUser=true;
				}
				else{
					sum[order]=input;
					order++;
				}
			}
			bf.close();
			}catch(Exception E){
				
			}
	}
	public void delete(){
		if(this.checkUser==true){
			i=0;
				try{
					FileWriter fw = new FileWriter("book.txt",false);
					BufferedWriter bw = new BufferedWriter(fw);
					do{
						String[] temp=sum[i].split(":");
					bw.write(temp[0]);
					bw.write(":");
					bw.write(temp[1]);
					bw.write(":");
					bw.write(temp[2]);
					bw.write(":");
					bw.write(temp[3]);
					bw.write(":");
					bw.write(temp[4]);
					bw.write(":");
					bw.write(temp[5]);
					bw.newLine();
					i++;
					}while(sum[i]!=null);
					bw.close();
					}catch(Exception E){
					}
		}
		else{
			JOptionPane.showMessageDialog(null, "The book is not find.", "Delete System", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
