package Pattern;

public class rightTriangle {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();	
		}
		// for number like reverse 1, 21, 321, 4321
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
