package recursion;
public class Program1 {
	static void printnum(int n)
	{
		if(n>0)//last in first out
			{
		printnum(n-1);
		System.out.println(n);
		}
	}
	public static void main(String[] args) {
		
		printnum(5);
	}
}

//it  is store in stack area 1 to5
//
