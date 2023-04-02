package Methods;

public class Program2 {
		//find Factorial by using method
	
	public static void main(String[] args) {
		int f=findfactorail(5);
		System.out.println(f);
	
	}
	public static int findfactorail(int a)
	{
		int fact =1;
		while(a>0)
		{
			fact=fact*a;
			a--;
		}
		return fact;
	}
}
