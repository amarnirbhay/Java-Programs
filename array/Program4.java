package array;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[4];
		System.out.println("Enter the Array element");
		ar[0]=sc.nextInt();
		System.out.println("Enter the Array element");
		ar[2]=sc.nextInt();
		
		for(int i=0; i< ar.length; i++)
		{
			System.out.print(ar[i]+ " ");
		}
		
	}
}
