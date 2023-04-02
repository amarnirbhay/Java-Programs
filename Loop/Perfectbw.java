package Loop;

public class Perfectbw {
	public static void main(String[] args) {
		for(int j=1;j<500;j++)
		{
		int sum=0;
		int n=j;
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
			
		}
		if (sum==n)
		{
			System.out.println("Perfect Number"+n);
		}
		
	}

}
}


