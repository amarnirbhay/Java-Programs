package array;

public class Program7 {
	public static void main(String[] args) {
		int ar[]= {10,20,40,50,9};
		
		int small = ar[0];
		
		for(int i=1; i<ar.length; i++)
		{
			if(small>ar[i])
			
				small=ar[i];		
		}
		System.out.println(small);
	}

}
