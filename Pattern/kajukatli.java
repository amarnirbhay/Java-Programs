package Pattern;

public class kajukatli {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if((i+j==2) || (j-i==2) || (i-j==2) || (i==3 && j==3))
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
