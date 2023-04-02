package Methods;

public class Strongnumbw {
	public static void main(String[] args) {
		for(int i=1;i<500;i++) {
		int n=i;
		int sum=0;
		int temp=n;
		while (n>0)
		{
			int r=n%10;
			int f=findfactorial(r);
			sum = sum+f;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(i+" :This is Strong number");
		}
	}
		}
	static int findfactorial(int n)
	{
		int fact =1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
}
