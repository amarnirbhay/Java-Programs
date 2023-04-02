package SelfPractice;

public class factorial {
	public static void main(String[] args) {
		int n=3;
		int  temp=n;
		int count =0;
		int fact=1;
		while(count<n) {
			 fact=fact+fact*count;
			 count ++;	
		}
		 
		System.out.println(fact);
		
		
	}
}
