package SelfPractice;

public class Factor {
		public static void main(String[] args) {
			int n=312;
			
			int i=1;
			int sum=0;
			while(i<=n/2) {
				if(n%i==0)
					sum=sum+i;
					i++;
					System.out.println(sum);		
			}
			
			
		}
}
