
public class WIN {

	public void check(int[] checkMap){
		int count=0;
		for (int i = 0; i < 49; i++) {
			if(checkMap[i]==1)
				count++;
		}
		if(count==40)
		{
			WINGUI AM=new WINGUI();
			AM.me();	
		}
	}
	
}
