package practiceStringArray;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Character to check it is vowel or Not");
		String c=sc.next(); 
		char ch = c.charAt(0);
		
		if(ch == 'i' || ch=='a' || ch == 'e' || ch == 'o' || ch== 'u' || ch == 'I' || ch=='A' || ch == 'E' || ch == 'O' || ch== 'U' ) {
			System.out.println("It is Vowel");
		}else {
			System.out.println("It is Consonent");
		}
	}

}
