package String;

import java.util.Scanner;
public class CountOfChar {
	
	public static String StringReduction(String str) {

		int count=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='c') {

				count ++;
			}		
		}
		System.out.println(count);
		return str;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println(StringReduction(sc.nextLine()));	
	}
}
