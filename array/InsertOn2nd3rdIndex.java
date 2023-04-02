package array;

public class InsertOn2nd3rdIndex {
	public static void main(String[] args) {
		//insert the value into index no 2 or 3
		int ar[]= {10,30,24,54,98};
		int temp[]=new int[ar.length+2];
		for (int i=0; i< temp.length; i++)
		{
			if(i<2)
				temp[i]=ar[i];
			else if(i==2)
				temp[i]=70;
			else if(i==3)
				temp[i]=63;
			else
				temp[i]=ar[i-2];
			
		}
		for (int i= 0; i< temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}

}
