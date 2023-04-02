package array;

public class ArrayAscending {
	// To Print the Array Element in Ascending Order
	public static void main(String[] args) {
	
	int ar[]= {10,32,42,42,56,13};
	for(int j=0;j<ar.length;j++)
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1]) {
	
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;		
			}
		}
	}
		for(int i=0;i<ar.length;i++)
		{
		System.out.println(ar[i]);
		}
}
}
