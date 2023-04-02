package Methods;

public class ArmStrongbw {
	static int findCount(int n)
	{
		int count =0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
		
	}
	static int findpow(int base, int exp )
	{
		int pow=1;
		while (exp>0)
		{
			pow=pow*base;
			exp--;
		}
		return pow;
	}
	public static void main(String[] args) {
		for(int i=1;i<10000;i++)
		{
		int n=i;
		int sum=0;
		int temp=n;
		int c=findCount(n);
		while(n>0)
		{
			int r=n%10;
			int p=findpow(r,c);
			sum=sum+p;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" :ArmStrong Number ");
		}
		
	}
		}
}
