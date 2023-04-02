package Methods;

public class Strongnum {
	public static void main(String[] args) {
		int n=145;
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
			System.out.println(temp+" :This is Strong number");
		}
		else  
		{
			System.out.println(temp+" :This is not Strong number");
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
