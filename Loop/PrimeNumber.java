package Loop;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int n =7;
		int count = 0;
		int i=2;
		
		while (i<=n/2)
		{ 
			if(n%i==0)
				count ++;
				i++;
		}
		if(count == 0)
		{
			System.out.println("prime num");
		}
		else
		{
			System.out.println("Nor Prime Number");
		}
		
	}
	

}
