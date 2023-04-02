package array;

import java.util.Scanner;

public class Prorgam6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ar[]= new String[4];
		System.out.println("Enter the Array Element");
		for(int i=0; i< ar.length; i++)
		{
			ar[i]= sc.nextLine();
		}
//		ar[0]="Your";
//		ar[3]="if";
		
		for( int i=0; i< ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
