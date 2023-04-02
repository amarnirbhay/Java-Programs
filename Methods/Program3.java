package Methods;

public class Program3 {
		//factorial By Recursion
	public static void main(String[] args) {
		int f=findfactorial(5);
		System.out.println(f);
	}
	static int findfactorial(int n) {
		if(n==1)
			return n;
		return n*findfactorial(n-1);
	}
}
