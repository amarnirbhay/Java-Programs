package Loop;

public class Evencount {
	public static void main(String[] args) {
		int n=23664;
		int count=0;
		int r=0;
		while(n>0)
		{
			r=n%10;
			if(r%2==0)
			count++;
			n=n/10;
		}
		System.out.println("Total Even count is : "+count);
	}
}



