
public class CheckNumber {

	private 
	int count=0;
	
	public void find(int map[][],int size,int left,int right){
		
     	if(map[left][right]==9)
	    	return ;
     	if(left!=0&&right!=0&&map[left-1][right-1]==9)
     		count++;
     	if(left!=0&&map[left-1][right]==9)
     		count++;
     	if(left!=0&&right!=size-1&&map[left-1][right+1]==9)
     		count++;
     	if(right!=0&&map[left][right-1]==9)
     		count++;
     	if(left!=size-1&&right!=0&&map[left+1][right-1]==9)
     		count++;
     	if(left!=size-1&&map[left+1][right]==9)
     		count++;
     	if(right!=size-1&&map[left][right+1]==9)
     		count++;
     	if(left!=size-1&&right!=size-1&&map[left+1][right+1]==9)
     		count++;
     	
     	map[left][right]=count;
     	count=0;
	}
}
