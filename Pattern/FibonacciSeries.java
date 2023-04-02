package Pattern;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Size of Series");
		int a=scanner.nextInt();
		
		int x=0;
		int y=1;
		System.out.print(x+" "+y+" ");
		for(int i=1;i<=a;i++)
		{
			int c=x+y;
			System.out.print(c+" ");
			x=y;
			y=c;
		}
	}
}
