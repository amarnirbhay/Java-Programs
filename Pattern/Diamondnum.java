package Pattern;

public class Diamondnum {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.print("  "); // Double Space 
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		for(int i=3;i>=1;i--)
		{ 
			for(int k=0;k<=3-i;k++)
			{
				System.out.print("  "); // Double Space 
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
