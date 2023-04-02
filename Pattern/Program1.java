package Pattern;

public class Program1 {
	static int x=3;
	
	
	public static void main(String[] args) {
		
		Program1 p1=new Program1();
		Program1 p2=new Program1();
			int n=5;
			char k='A'; //char k=65;
			for (int i=0;i<n;i++)//row
			{
				for(int j=0;j<n;j++)//column
				{
					if(i>=j)
						System.out.print(k++%2 +" ");
					else
						System.out.print(" ");
					
				}
				System.out.println();
				
}
}
}
