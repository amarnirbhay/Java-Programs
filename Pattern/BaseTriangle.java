package Pattern;

public class BaseTriangle {

	public static void main(String[] args) {
		
		for(int i =1 ;i<=5;i++)
		{
			for(int j= 1;j<=i;j++)
			{
				System.out.print(i+" "); // ==>SOP(j) for output 1, 12, 123
			}
			System.out.println(" ");
		}
	}
}
