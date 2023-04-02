package TwoDArray;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array value min 6");
		
		int ar[][]=new int[2][3];
		for (int i= 0; i<2; i++) {
			
			for(int j = 0; j< 3; j++) {
				
				ar[i][j]=sc.nextInt();			
			}
	}
		for(int i = 0; i<2; i++) {
			for(int j = 0; j< 3; j++) {
				System.out.println(ar[i][j]);
			}
		}
	}
}
