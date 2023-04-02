package array;

public class DuplicateValueForTwo {
	//Duplicate Values for only two/
	public static void main(String[] args) {
		int a[]= {20,30,40,20,30,50,50,30};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])
				System.out.println(j+" "+a[j]+" is Duplicate in this Array");
			
			}
		}
	}
	
}
