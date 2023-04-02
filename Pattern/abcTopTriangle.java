package Pattern;

public class abcTopTriangle {
	public static void main(String[] args) {
		
		for(char i='e'; i>='a';i--)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// Second Method
		for(int i =5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+j)+"  ");
			}
			System.out.println();
		}
		
	}

}
