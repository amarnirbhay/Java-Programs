package SelfPractice;

public class Palindrom {
	public static void main(String[] args) {

		int a = 12231;
		int rev = 0;
		int temp = a;
		while (a > 0) {

			int r = a % 10;
			rev = rev * 10 + r;
			a = a / 10;
		}
		System.out.println(rev);

		if (rev == temp) {
			System.out.println("palindrom");
		} else {
			System.out.println("Not Palindrom");
		}
	}
}
