package practiceStringArray;

public class Missing_Element {
	
	public static int missingNumber(int [] a) {
		int n=a.length;
		//Sum of all numbers
		int total=((n)*(n+1))/2;
		int sum1=0;
		for(int i=0;i<n;i++) 
		sum1+=a[i];
	
		return total-sum1;

	}
	public static void main(String[] args) {
		
		int [] a = {1,2,4,5,6};
		System.out.println(missingNumber(a));
		
			
		}

}
