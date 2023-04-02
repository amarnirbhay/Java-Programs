package Pattern;

public class AbcBaseTriangle {
	public static void main(String[] args) {
		for(int i=1 ; i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+j)+"  ");
			}
			System.out.println();
		}
		
		//Second Method Using Loop Only
		for(char i='a';i<='e';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
}
