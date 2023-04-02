package Loop;

public class Perfect {
	public static void main(String[] args) {
		int sum=0;
		int n=6;
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			sum=sum+i;
			i++;
		System.out.println();
		}
		
		if (sum==n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}
	}

}
