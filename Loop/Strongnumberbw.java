package Loop;

public class Strongnumberbw {
	public static void main(String[] args) {
		for(int i=1;i<1000;i++)
		{
		int n=i;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			int fact=1;
			while(r>0)
			{
				fact=fact*r;
				r--;
			}
			sum=sum+fact;
			n=n/10;
			
		}
		
		if(sum==temp)
		{
			System.out.println("Strong number: "+sum);
		}
		
	}
	}}

