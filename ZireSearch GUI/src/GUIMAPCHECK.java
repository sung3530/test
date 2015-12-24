import javax.swing.JButton;
public class GUIMAPCHECK {
	private
		WIN winch=new WIN();
		LOSSGUI loss=new LOSSGUI();
		emtyPlus hoho = new emtyPlus();
		
	public void checkMap(int count, JButton btn[],int[][] map,int checkMap[]){
		if(map[count/7][count%7]!=9&&map[count/7][count%7]!=0){
			 btn[count].setText(""+map[count/7][count%7]);
			  checkMap[count]=1;
			  winch.check(checkMap);
			}
			else if(map[count/7][count%7]==9){
				for (int j = 0; j < 49; j++) {
					if(map[j/7][j%7]!=9)
					btn[j].setText(""+map[j/7][j%7]);
					else if(map[j/7][j%7]==9)
						btn[j].setText("*");
				}
				loss.losss();
			}
			
			else if(map[count/7][count%7]==0){
				btn[count].setText(""+map[(count)/7][(count)%7]);
				hoho.recursive(map, 7, count,checkMap, btn);
				winch.check(checkMap);
			}
		
	}
	
	
}
