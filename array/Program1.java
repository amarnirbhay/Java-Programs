package array;

public class Program1 {
	// Basic syntax:- datatype arrayname[]={value1, val2,....val n};
	
	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i]; 
//			System.out.println(ar[i]); //use to print the given arrsy values
			
		}
		System.out.println(sum);
	}
}
					