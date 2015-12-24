
public class SprayNumber {

	
	public void check(int map[][],int size){
		
    CheckNumber ch=new CheckNumber();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				ch.find(map, size, i, j);
			}
		}
		
	}
}
