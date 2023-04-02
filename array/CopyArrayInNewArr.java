package array;

public class CopyArrayInNewArr {
	// Copy the Array Element Into New array and Reverce it
	public static void main(String[] args) {
		int a[] = { 20, 30, 40, 50, 12, 13 };

		int temp[] = new int[a.length];

		for (int i = 0; i < a.length; i++)
			
//				for(int i=0;i<a.length-2;i++) for Delete the Array Element. You want to Delete.
		{
			temp[i] = a[a.length - 1 - i];
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(temp[i]);

		}
	}
}
