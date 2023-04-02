package array;

public class Oddarry {
	
	public static void main(String[] args) {
		int ar[]= {21,31,12,14};
		int sum=0;
		for(int i=0; i< ar.length;i++)
		{
		if(ar[i]%2!=0)
			sum=sum+ar[i];
//			System.out.println(ar[i]);
	}
			System.out.println(sum);
	}
}
