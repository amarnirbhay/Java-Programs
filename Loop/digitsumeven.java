package Loop;

public class digitsumeven {

	
		static int sum(int a,int b)
		{
			return a+b;
			
		}
		public static void main(String[] args) {
			int r=sum(23,10);
					System.out.println(r);
			if (r%2==0)
			{
				System.out.println("Even num");	
			}
			else 
				System.out.println("Odd number");
	}

}
