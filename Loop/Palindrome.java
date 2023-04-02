package Loop;

public class Palindrome {
	public static void main(String[] args) {
		
		int n=1234321;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if (rev==temp)
		{
			System.out.println("Palindrome number");
		}
		else 
		{
			System.out.println("Not Palindrome number");
		}
	}

}
