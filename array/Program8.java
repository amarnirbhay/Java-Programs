package array;

public class Program8 {
		public static void main(String[] args) {
			int ar[]= {10,20,40,50,9};
			
			int big = ar[0];
			
			for(int i=1; i<ar.length; i++)
			{
				if(big<ar[i])
				{
					big=ar[i];
					
				}
				else {
					System.out.println(big);
				}
			}
		}
}
