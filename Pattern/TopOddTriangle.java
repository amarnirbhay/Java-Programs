package Pattern;

public class TopOddTriangle {
	public static void main(String[] args) {
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i*2-1;j++) // for even rows==>i*2 only
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
