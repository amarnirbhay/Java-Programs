package Pattern;

public class Vtype {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
//			for(int k=1;k<=5-i;k++)
//			{
//				System.out.print("  ");
//			}
			for(int j=0;j<=8;j++)
			{
				if((i+j==4) || (j-i==4)) {
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
