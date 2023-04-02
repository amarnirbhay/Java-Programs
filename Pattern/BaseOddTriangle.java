package Pattern;

public class BaseOddTriangle {
	public static void main(String[] args) {
		
		for(int i= 1 ; i<=5;i++)
		{
			for(int j =1;j<=i*2-1;j++) // for ODD output
//				for(int j =1;j<=i*2;j++) for Even 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

//for(int j =1;j<=i*2;j++) for Even 
//1 2 
//1 2 3 4 
//1 2 3 4 5 6 
//1 2 3 4 5 6 7 8 
//1 2 3 4 5 6 7 8 9 10 
