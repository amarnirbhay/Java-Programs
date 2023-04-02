package array;

public class RemoveDuplicate2 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,4,4,5,6,6,7};
		int temp[]= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=-1;
				}
			}
		}
		
		System.out.print(" removed Array is :");
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=-1)
			{
				System.out.print(arr[i]);
			}
	}

}
