package array;

public class Program9 {
	// Copy the Array Element Into New array
	public static void main(String[] args) {
		int a[]	= {20,30,40,50,12,13};
		
		int temp[]=new int [a.length];
		
		for(int i=0;i<a.length;i++)
		{
			temp[i]=a[i];
			
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(temp[i]);
		}
				}
}
