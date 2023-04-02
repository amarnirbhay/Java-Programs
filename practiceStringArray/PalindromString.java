package practiceStringArray;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		String rev = "";
		for(int i=p.length()-1;i>=0;i--) {
			
//			char x=p.charAt(i);
			rev=rev+p.charAt(i);
			
		}
		if(p.equalsIgnoreCase(rev)) {
			System.out.println("p");
			
		}
		else {
			System.out.println("n");
		}
	}

}
