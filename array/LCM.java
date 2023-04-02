package array;

public class LCM {
	public static void main(String[] args) {
		int ar[]= {5,8,2,11};
		int j;
		for(j=1;;j++)
		{
			
//			for(int i=0;i<ar.length;i++)
				
			if(j%ar[0]==0 && j%ar[1]==0 && j%ar[2]==0 && j%ar[3]==0)
			{
				break;
			}
			
		}
		System.out.println("LCM is "+j);
	}
	
}
