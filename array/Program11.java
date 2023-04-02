package array;

public class Program11 {
	public static void main(String[] args) {
		int ar[]= {4,6,7,3,13};
		int g=ar[0];
		
		for(int i=1; i<ar.length;i++)
		{
			if(g<ar[i])
			{
				g=ar[i];
			}
			
		}
		System.out.println(g);
	}
}
