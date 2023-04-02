package array;

public class InsertValueInIndexNo {
	public static void main(String[] args) {
		//insert the value into index no 2
		int ar[]= {10,30,24,54,98};
		int temp[]=new int[ar.length+1];
		for (int i=0; i< temp.length; i++)
		{
			if(i<2)
				temp[i]=ar[i];
			else if(i==2)
				temp[i]=70;
			else
				temp[i]=ar[i-1];
			
		}
		for (int i= 0; i< temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}
}
