
public class MainGUI{
	public static void main(String[]args){
		int checkMap[]=new int[49];
	
			for (int j = 0; j <49; j++) {
				checkMap[j]=0;			
			}

		MAP map=new MAP();

		
		SprayNumber sp=new SprayNumber();
		map.generateZire();
		sp.check(map.getMap(), map.getSize());
		for (int i = 0; i < map.getSize(); i++) {
			for (int j = 0; j < map.getSize(); j++) {
				System.out.print(""+map.getMap()[i][j]);		
			}
			System.out.println("");
		}
		GUI grapic = new GUI(map.getMap(), checkMap);
	}
}
