import javax.swing.JButton;

public class emtyPlus {
    


	
	public void recursive(int map[][],int size, int count, int checkMap[],JButton btn[]){
		checkMap[count]=1;
		if(count/7!=0&&count%7!=0){
			if(map[count/7-1][count%7-1]!=9&&map[count/7-1][count%7-1]!=0)
			{
				checkMap[count-8]=1;
				btn[count-8].setText(""+map[(count-8)/7][(count-8)%7]);
			}
			else if(map[count/7-1][count%7-1]!=9&&map[count/7-1][count%7-1]==0&&checkMap[count-8]==0){
				btn[count-8].setText(""+map[(count-8)/7][(count-8)%7]);
				checkMap[count-8]=1;
     		    recursive(map, size,count-8,checkMap, btn);
			}
		}
     	if(count/7!=0){
			if(map[count/7-1][count%7]!=9&&map[count/7-1][count%7]!=0)
			{
				checkMap[count-7]=1;
				btn[count-7].setText(""+map[(count-7)/7][count%7]);
			}
			else if(map[count/7-1][count%7]!=9&&map[count/7-1][count%7]==0&&checkMap[count-7]==0){
				btn[count-7].setText(""+map[(count-7)/7][count%7]);
				checkMap[count-7]=1;
	     		recursive(map, size,count-7,checkMap, btn);
			}
		}
     	if(count/7!=0&&count%7!=size-1){
			if(map[count/7-1][count%7+1]!=9&&map[count/7-1][count%7+1]!=0)
			{
				checkMap[count-6]=1;
				btn[count-6].setText(""+map[(count-6)/7][(count-6)%7]);
			}
			else if(map[count/7-1][count%7+1]!=9&&map[count/7-1][count%7+1]==0&&checkMap[count-6]==0){
				btn[count-6].setText(""+map[(count-6)/7][(count-6)%7]);
				checkMap[count-6]=1;
	    		recursive(map, size,count-6,checkMap, btn);
			}
		}
 
     	if(count%7!=0){
			if(map[count/7][count%7-1]!=9&&map[count/7][count%7-1]!=0)
			{
				checkMap[count-1]=1;
				btn[count-1].setText(""+map[(count-1)/7][(count-1)%7]);
			}
			else if(map[count/7][count%7-1]!=9&&map[count/7][count%7-1]==0&&checkMap[count-1]==0){
				btn[count-1].setText(""+map[(count-1)/7][(count-1)%7]);
				checkMap[count-1]=1;
		  		recursive(map, size,count-1,checkMap, btn);
			}
		}
   
     	if(count/7!=size-1&&count%7!=0){
			if(map[count/7+1][count%7-1]!=9&&map[count/7+1][count%7-1]!=0)
			{
				checkMap[count+6]=1;
				btn[count+6].setText(""+map[(count+6)/7][(count+6)%7]);
			}
			else if(map[count/7+1][count%7-1]!=9&&map[count/7+1][count%7-1]==0&&checkMap[count+6]==0){
				btn[count+6].setText(""+map[(count+6)/7][(count+6)%7]);
				checkMap[count+6]=1;
				recursive(map, size,count+6,checkMap, btn);
			}
     	}
     		
     	if(count/7!=size-1){
			if(map[count/7+1][count%7]!=9&&map[count/7+1][count%7]!=0)
			{
				checkMap[count+7]=1;
				btn[count+7].setText(""+map[(count+7)/7][(count+7)%7]);
			}
			else if(map[count/7+1][count%7]!=9&&map[count/7+1][count%7]==0&&checkMap[count+7]==0){
				btn[count+7].setText(""+map[(count+7)/7][(count+7)%7]);
				checkMap[count+7]=1;
				recursive(map, size,count+7,checkMap, btn);
			}
     	}
     		
     	if(count%7!=size-1){
			if(map[count/7][count%7+1]!=9&&map[count/7][count%7+1]!=0)
			{
				checkMap[count+1]=1;
				btn[count+1].setText(""+map[(count+1)/7][(count+1)%7]);
			}
			else if(map[count/7][count%7+1]!=9&&map[count/7][count%7+1]==0&&checkMap[count+1]==0){
				btn[count+1].setText(""+map[(count+1)/7][(count+1)%7]);
				checkMap[count+1]=1;
				recursive(map, size,count+1,checkMap, btn);
			}
		}
     		
     	if(count/7!=size-1&&count%7!=size-1){
			if(map[count/7+1][count%7+1]!=9&&map[count/7+1][count%7+1]!=0)
			{
				checkMap[count+8]=1;
				btn[count+8].setText(""+map[(count+8)/7][(count+8)%7]);
			}
			else if(map[count/7+1][count%7+1]!=9&&map[count/7+1][count%7+1]==0&&checkMap[count+8]==0){
				btn[count+8].setText(""+map[(count+8)/7][(count+8)%7]);
				checkMap[count+8]=1;
				recursive(map, size,count+8,checkMap, btn);
			}
		}
	}
	
}
