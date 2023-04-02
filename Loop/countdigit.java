package Loop;

public class countdigit {
	public static void main(String[] args) {
		int n=234;
		int count=0;
		while(n>0)
		{
			
			count++;
			n=n/10;
		}
		System.out.println("Total count is : "+count);
	}
}
