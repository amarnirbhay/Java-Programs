package Methods;

import java.util.Scanner;

public class Program1 {
	static int findsum(int a, int b)
	{
		return a+b;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Value of a&b");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int r=findsum(a,b);
			System.out.println(r);
			if(r%2==0) {
				System.out.println("Even sum");
				
			}
			else {
				System.out.println("Odd sum");
			}
		}
}
