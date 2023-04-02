 package array;

public class DeleteIndex2value {
	public static void main(String[] args) {
		//Delete the Array Element from index No 2
				int ar[]= {10,30,24,54,98};
				int temp[]=new int[ar.length-2];
				for (int i=0; i< temp.length; i++)
				{
					if(i<2)
					temp[i]=ar[i];
					else
						temp[i]=ar[i+2];
				}
				for (int i= 0; i< temp.length;i++)
				{
					System.out.println(temp[i]);
				}
			}
	}


