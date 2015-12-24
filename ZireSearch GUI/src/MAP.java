
public class MAP {
	private
	int size=7;
	int map[][]=new int[size][size];
	
	public int[][] getMap(){
		return map;
	}
	public int getSize(){
		return size;
	}
	 public void generateZire(){
			int randValue_1, randValue_2;
			int whileEnd=0;
			while(whileEnd<10){
				double randomValue= Math.random();
				double randomValue2= Math.random();
				randValue_1=(int)(randomValue*size);
				randValue_2=(int)(randomValue2*size);

				if(map[randValue_1][randValue_1]==9){
				}
				else{
					map[randValue_1][randValue_2]=9;
					whileEnd++;
				}
			}
		}
}
