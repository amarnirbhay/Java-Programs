package Pattern;

public class SimpleTri {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("--------------- ");
		// for TOP to Bottom
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-------Diamond-------- ");
		//Diamond
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
//		System.out.println("--------------- ");
		// for TOP to Bottom
		for(int i=4;i>=1;i--)
		{
			for(int k=0;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
