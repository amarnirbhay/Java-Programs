package Pattern;

public class Diamond {
	public static void main(String[] args) {
	for(int i=0;i<=5;i++)//row
	{
		for(int j=5;j>i;j--)//Space
		{
			System.out.print("  ");
			
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--)//row
	{
		for(int j=5;j>i;j--)//Space
		{
			System.out.print("  ");
			
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
	}
}
}