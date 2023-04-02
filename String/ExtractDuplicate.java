package String;
public class ExtractDuplicate {		
	public static void main(String[] args) {
		
		String []arr = {"java", "python", "css","python", "java"};
//		int temp[]=new int[arr.length];
		boolean flag = false;
//		int count = 1;
		for(int i=0;i<arr.length;i++) 
		{	
			for(int j=i+1;j<arr.length;j++) 
			{		
				if(arr[i]==arr[j]) 
				{	
//					count++;
					System.out.println("Duplicate element is: "+arr[i] +" and ");
				}
				else {
					flag=true;
				}	
			}
		}
		if(flag==false)
		{	
			System.out.println("Duplicate not Found");
		}
	}
}
