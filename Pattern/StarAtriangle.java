package Pattern;

public class StarAtriangle {
		public static void main(String[] args) {
			for(int i=1;i<=5;i++)
			{
				for(int k=1;k<=5-i;k++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i*2-1;j++)
				{
					if(j%2==0) {
						System.out.print("A ");
					}
					else {
						System.out.print("* ");
					}
				}
				System.out.println();
			}
		}
}
