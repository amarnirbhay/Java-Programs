package Pattern;

public class AandZeroTri {
	public static void main(String[] args) {
		char c='a'; char x='a';
		for(int i=1;i<=5;i++)
		{
				if(i%2==0) {
					c='0';
				}
				else {
					c=x++;
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(c+" ");
				}
				System.out.println();
		}
	}
}
